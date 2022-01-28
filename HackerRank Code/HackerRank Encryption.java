import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
  public static String encryption(String s) {
        int count=0;
        s = s.replaceAll("//s","");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!= ' '){
                count++;
            }
        }
        int row = (int)Math.floor(Math.sqrt(count));
        int col = (int)Math.ceil(Math.sqrt(count));
         int len=(int) (row>col?row:col);
        if(row>=col){
         col=row;
        }
        else{
         col= row+1;
        }  
         String result="";
            for(int i=0;i<len;i++) {
                for(int j=i;j<s.length();j=(int) (j+col)) {
                    char ch=s.charAt(j);
                    result+=ch;
                }
                result+=" ";
            }
            return result;
 
  }
   
   }


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
