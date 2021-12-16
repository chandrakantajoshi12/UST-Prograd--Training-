public class CurrencyConvertor {

    public  double rupeesToRupees(double currencyInRupees) {

        return currencyInRupees;
    }

    public static double rupeesToDollar(double currencyInRupees) {
        return currencyInRupees / 74.85;
    }


    public double dollarToRupees(double currencyInDollar)
    {
        return currencyInDollar * 74.85;
    }


    public double pound(double currencyInRupees) {


        return currencyInRupees / 100.71;
    }

    public  double turkish(double currencyInRupees) {
        return currencyInRupees /  5.28;
    }

    public  double euro(double currencyInRupees) {
        return currencyInRupees / 85.69;
    }
}
