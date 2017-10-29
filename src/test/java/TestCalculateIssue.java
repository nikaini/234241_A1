/* 
 * Semester: A171
 * Course: STIW3054
 * Group: A
 * Task: Assignment 1
 * Matric Num: 234241
 * Name: Nik Nur Aini Bt Nik Mat
 */
import com.nikaini._a1.CalculateIssue;
import java.io.File;
import org.junit.Assert;
import org.junit.Test;


public class TestCalculateIssue {

    CalculateIssue cc = new CalculateIssue();
    File directory;
    String[] exts;

    @Test
    public void testgetCount() {
        Assert.assertEquals(3, cc.getCount());
    }
    
   @Test
   public void testCount(){
       Assert.assertEquals(3, cc.countFiles(directory, exts));
   }

}
