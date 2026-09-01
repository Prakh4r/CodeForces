import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    static class FastScanner {
        private final BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    static void solve(FastScanner fs, StringBuilder out) throws Exception {
        int n = fs.nextInt();
        int k = fs.nextInt();

        String s = fs.next();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int noOfOdd = 0;
        for (int i = 0; i < 26; i++) {
            if(freq[i] % 2 != 0){
                noOfOdd++;
            }
        }
        if(k >= Math.max(0, noOfOdd - 1)){
            out.append("YES").append('\n');
        }else{
            out.append("NO").append('\n');
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

//        int t = 1;
        int t = fs.nextInt();
        while (t-- > 0) {
            solve(fs, out);
        }

        System.out.print(out);
    }
}