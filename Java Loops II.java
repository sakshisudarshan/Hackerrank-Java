import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            series(a, b, n);
        }
        in.close();
    }
    
    public static void series(int a, int b, int n) {
        int term = a;
        for (int i = 0; i < n; i++) {
            term += (b * (1 << i)); // Using bitwise shift for 2^i
            System.out.print(term + " ");
        }
        System.out.println();
    }
}
