import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    

    public static String timeInWords(int h, int m) {
  String[] numberWords = new String[] {
                "",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten",
                "eleven",
                "twelve",
                "thirteen",
                "fourteen",
                "fifteen",
                "sixteen",
                "seventeen",
                "eighteen",
                "nineteen",
                "twenty",
                "twenty one",
                "twenty two",
                "twenty three",
                "twenty four",
                "twenty five",
                "twenty six",
                "twenty seven",
                "twenty eight",
                "twenty nine"
        };
        
        Scanner in = new Scanner(System.in);
         
        //  h = in.nextInt();
        //  m = in.nextInt();
        String time = "";
        if (m == 0) {
      time = numberWords[h] + " o' clock";
    } else if (m == 15) {
      time = "quarter past " + numberWords[h];
    } else if (m == 30) {
      time = "half past " + numberWords[h];
    } else if (m == 45) {
      time = "quarter to " + numberWords[h + 1];
    } else if (m == 1) {
      time = numberWords[m] + " minute past " + numberWords[h];
    } else if (m < 30) {
      time = numberWords[m] + " minutes past " + numberWords[h];
    } else {
      time = numberWords[60 - m] + " minutes to " + numberWords[h + 1];
    }
    return time;
  }

    }


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
