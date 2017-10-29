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

public class Assignment1 {

    private static final String FILE_DIR = "C:\\Users\\User\\Desktop\\234241_A1\\Test_file";
    private static final String FILE_JAVA_EXT = ".java";
      
    public static void main(String[] args) throws InterruptedException{
               
        File file = new File(FILE_DIR);
        
        CalculateFile countFile = new CalculateFile( file, "Java", FILE_JAVA_EXT );
        countFile.run();
        
        CalculateIssue countIssue = new CalculateIssue( file, "Java", FILE_JAVA_EXT );
        countIssue.run();
        
    }
}
