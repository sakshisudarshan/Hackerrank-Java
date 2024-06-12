import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the input integer N
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        // Close the BufferedReader
        bufferedReader.close();
        
        // Loop through numbers 1 to 10 and print the multiples of N
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.printf("%d x %d = %d%n", N, i, result);
        }
    }
}
