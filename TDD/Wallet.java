//As a wallet owner, I would like to be able to know that 74.85 rupees is equal to 1 dollar.
//As a wallet owner I would like to be able to put money into my wallet so that I can take it out later.
//As a wallet owner, I want to know the total money my wallet has for the preferred currency, (Given preferred currency is Rs.)
// When Rs.50 & $1 added to my wallet, Then the sum of money in the wallet is Rs.124.85
//As a wallet owner, I want to know the total money my wallet has for the preferred currency.
//When Rs.74.85, $1, Rs.149.7 added to my wallet, Then sum of money in the wallet is $4, (Given preferred currency is $)
//As a wallet owner I would like to be able to take a specified amount of money out of the wallet.


public class Wallet {
    private double balanceOfWallet = 0;

    public Wallet(double balanceOfWallet) {
        this.balanceOfWallet = balanceOfWallet;
    }

    public double rupeeToDollar(double currencyInRupees) {
        return currencyInRupees / 74.85;
    }

    public double dollarToRupees(double currencyInDollar) {
        return currencyInDollar * 74.85;
    }

    public double addAmountInDollarToWallet(double amountInDollar) {
        balanceOfWallet = balanceOfWallet + dollarToRupees(amountInDollar);
        return balanceOfWallet;
    }

    public double addAmountInRupeesToWallet(double amountInRupees) {
        balanceOfWallet = balanceOfWallet + amountInRupees;
        return balanceOfWallet;
    }

    public double withdrawalAmountInRupeesFromWallet(double amountInRupees) {
        if (balanceOfWallet < amountInRupees) {
            throw new IllegalArgumentException("amount should be greater than balance");
        }

        balanceOfWallet = balanceOfWallet - amountInRupees;
        return balanceOfWallet;
    }

    public double withdrawalAmountInDollarFromWallet(double amountInDollar) {
        if (amountInDollar > rupeeToDollar(balanceOfWallet)) {
            throw new IllegalArgumentException("amount should be greater than balance");
        }
        balanceOfWallet = balanceOfWallet - dollarToRupees(amountInDollar);
        return balanceOfWallet;
    }

    public double getWalletAmount(String preferredCurrency) {

        if (preferredCurrency == "rupees") {
            return this.balanceOfWallet;
        } else if (preferredCurrency == "dollars") {
            return rupeeToDollar(this.balanceOfWallet);
        } else {
            throw new IllegalArgumentException("currency is not valid");
        }
    }
}