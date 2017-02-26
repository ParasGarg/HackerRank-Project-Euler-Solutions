import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long termSum = 0;
            
            // initializing variables for fibonacci series
            long n1 = 1;
            long n2 = 2;
            long nextTerm = 0;
            
            // checking even-valued terms and size for 2nd term
            if (n2 % 2 == 0 && n2 <= n) {
                termSum += n2;
            }

            // calculating fibonacci series
            for (int i = 3; i <= n; i++) {
                nextTerm = n1 + n2;
                n1 = n2;
                n2 = nextTerm;
                
                // checking even-valued terms and size of term
                if (nextTerm % 2 == 0 && nextTerm <= n) {
                    termSum += nextTerm;
                }
                
                // breaking if nextTerm exceeds the n
                if (nextTerm > n) {
                    break;
                }
            }
            
            // printing output
            System.out.println(termSum);           
        }
    }
}
