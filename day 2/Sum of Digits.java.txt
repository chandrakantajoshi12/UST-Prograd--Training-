public class DRoot {
  public static int digital_root(int n) {
   int sum=0;
    while(n>=0){
      n=n%10;
      sum=sum+n;
      n=n/10;
      n++;
    }
    return sum;
  }
}