import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    

    public static void extraLongFactorials(int n) {
     BigInteger fact=BigInteger.valueOf(1);
    for(int i=1;i<=n;i++){
          fact=fact.multiply(BigInteger.valueOf(i));
    }
    System.out.println(fact);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}
