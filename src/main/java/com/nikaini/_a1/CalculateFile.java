/* 
 * Semester: A171
 * Course: STIW3054
 * Group: A
 * Task: Assignment 1
 * Matric Num: 234241
 * Name: Nik Nur Aini Bt Nik Mat
 */

package com.nikaini._a1;

import java.io.File;


public class CalculateFile implements Runnable {
        int count = 0;
        File file;
        String[] exts;
        String title;
 
    public CalculateFile(File file, String title, String... exts) throws InterruptedException {
        this.exts = exts;
        this.file = file;
        this.title = title;   
    }
   
    public int countFiles(File directory, String[] exts) {
        this.exts = exts;
       
        for(File file : directory.listFiles()) {
            if(file.isDirectory()) {
                count += countFiles(file, exts);
            }    
        String textFile = file.toString();
        for (String ext : exts){
            if (textFile.endsWith(ext)){
                count++;
             }
        }
            }
            return count;
        }
 
    public int getCount(){
        int count = this.count;
        return count;
    }
 
    public void run() {
        count += countFiles(file, exts);
        System.out.println("Number of Java Files = " + count);
    }
}
