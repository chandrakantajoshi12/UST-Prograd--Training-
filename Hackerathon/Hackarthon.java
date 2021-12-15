
import java.util.Scanner;
import  java.util.*;
import  java .lang.*;

public class Currency extends  CurrencyConvertor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amount;
        CurrencyConvertor currencyConvertor = new CurrencyConvertor();


        int x;
        while (true)
        {
            System.out.println("WelCome To The Currency Convertor");
            System.out.println("Enter Currency Do you Want to Change :");
            System.out.println("1.Rupees \n  2.Dollar \n 3.Euro  \n 4.Turkish");
            System.out.println("Enter required Currency");

            int in = scan.nextInt();
      try {
          switch (in) {
              case 1:
                  System.out.println("Enter Amount");
                  amount = scan.nextDouble();
                  System.out.println(currencyConvertor.rupeesToRupees(amount));
                  break;

              case 2:
                  System.out.println("Enter Amount");
                  amount = scan.nextDouble();
                  System.out.println(currencyConvertor.rupeesToDollar(amount));
                  break;
              case 3:
                  System.out.println("Enter Amount");
                  amount = scan.nextDouble();
                  System.out.println(currencyConvertor.euro(amount));
                  break;
              case 4:
                  System.out.println("Enter Amount");
                  amount = scan.nextDouble();
                  System.out.println(currencyConvertor.pound(amount));
                  break;
              case 5:
                  System.out.println("Enter Amount");
                  amount = scan.nextDouble();
                  System.out.println(currencyConvertor.turkish(amount));
                  break;
              default:
                  System.out.println("Thank you");
          }

          System.out.println("Do you want More Transaction then press 1 ");
          x = scan.nextInt();

          if (x == 1) {
              continue;
          } else {
              break;
          }
      }
      catch (IllegalArgumentException e){
          System.out.println("Enter Valid Amount");
      }
        }

    }
    }



