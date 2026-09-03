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
        int m = fs.nextInt();

        int minMoves = (n + 1) / 2;

        int ans = minMoves;

        if (ans % m != 0) {
            ans += m - ans % m;
        }

        if (ans > n) {
            out.append(-1);
        } else {
            out.append(ans);
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = 1;
        //int t = fs.nextInt();
        while (t-- > 0) {
            solve(fs, out);
        }

        System.out.print(out);
    }
}