
import java.io.IOException;
import java.util.Scanner;
import  java.util.*;
import  java .lang.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Currency   {
    static double round(double value){
        return (double)Math.round(value*100)/100 ;
    }

    public static void main(String[] args) throws IOException {

        double amount;
        CurrencyConvertor currencyConvertor = new CurrencyConvertor();
        Scanner scan = new Scanner(System.in);
        Logger logger = Logger.getLogger("Log");
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
         logger.info("Program Currency");
        int x;
        while (true)
        {
            System.out.println("WelCome To The Currency Convertor");
            System.out.println("Enter Currency Do you Want to Change :");
            System.out.println("1.Rupees \n  2.Dollar \n 3.Euro  \n 4.Turkish \n 5.Pound \n 6.Exit");
            System.out.println("Enter required Currency");

            int in = scan.nextInt();
      try {
          switch (in) {
              case 1:
                  System.out.println("Enter Amount");
                  amount = scan.nextDouble();
                  System.out.println(round(currencyConvertor.rupeesToRupees(amount)));
                  logger.info("Converted Amount :" +amount);
                  System.out.println("Amount in Dollar : " +(round(currencyConvertor.rupeesToDollar(amount))));
                  logger.info("Converted Amount :" +amount);
                  break;


              case 2:
                  System.out.println("Enter Amount");
                  amount = scan.nextDouble();
                  System.out.println(round(currencyConvertor.rupeesToDollar(amount)));
                  logger.info("Converted Amount :" +amount);
                  System.out.println("Amount in Rupees "+ (round(currencyConvertor.dollarToRupees(amount))));
                  break;
              case 3:
                  System.out.println("Enter Amount");
                  amount = scan.nextDouble();
                  System.out.println(round(currencyConvertor.euro(amount)));
                  logger.info("Converted Amount :" +amount);
                  break;
              case 4:
                  System.out.println("Enter Amount");
                  amount = scan.nextDouble();
                  System.out.println(round(currencyConvertor.pound(amount)));
                  logger.info("Converted Amount :" +amount);
                  break;
              case 5:
                  System.out.println("Enter Amount");
                  amount = scan.nextDouble();
                  System.out.println(round(currencyConvertor.turkish(amount)));

                  logger.info("Converted Amount :" +amount);
                  break;
              case 6:
                  System.out.println("Exit");
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



