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
        String s = fs.next();

        if(s.length() > 10){
            System.out.print(s.charAt(0));
            System.out.print(s.length() - 2);
            System.out.print(s.charAt(s.length() - 1));
            System.out.println();
        }else{
            System.out.println(s);
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