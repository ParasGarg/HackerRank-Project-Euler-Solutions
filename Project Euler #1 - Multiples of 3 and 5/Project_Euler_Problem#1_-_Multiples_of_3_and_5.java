import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                    // user input class
        
        long t = in.nextLong();                                 // getting number of test cases
        for(int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();                             // getting natural number
            long sum = 0;                                       // sum of multiples
            
            long multiplesOfThree = (n-1) / 3;                  // finding total multiples of 3
            multiplesOfThree = 3*multiplesOfThree * (multiplesOfThree+1)/2;
            
            long multiplesOfFive = (n-1) / 5;                   // finding total multiples of 5
            multiplesOfFive = 5*multiplesOfFive * (multiplesOfFive+1)/2;
            
            long multiplesOfBoth = (n-1) / 15;                  // finding total multiples of least common multiple of 3 and 5
            multiplesOfBoth = 15*multiplesOfBoth * (multiplesOfBoth+1)/2;
            
            sum = multiplesOfThree + multiplesOfFive - multiplesOfBoth;
            System.out.println(sum);                            // printing output            
        }
    }
}
