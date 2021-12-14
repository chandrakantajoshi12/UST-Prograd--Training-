import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {
    Wallet wallet = new Wallet(0);

    @Nested
    public class RupeesToDollarTest {
        @Test
        public void checkSeventyFourPointEightFiveRupeesIsEqualToOneDollar() {
            double actualCurrency = wallet.rupeeToDollar(74.85);
            double expectedCurrency = 1;
            assertEquals(expectedCurrency, actualCurrency);
        }
    }

    @Nested
    public class DollarToRupees {
        @Test
        public void checkOneDollarIsEqualToSeventyFourPointEightFiveRupees() {
            double actualCurrency = wallet.dollarToRupees(1);
            double expectedCurrency = 74.85;
            assertEquals(expectedCurrency, actualCurrency);
        }
    }

    @Nested
    public class AddCurrency {
        @Test
        public void checkAdditionOfFiftyRupeesAndOneDollarIsEqualsToOneHundredAndTwentyFourPointEightFive() {
            wallet.addAmountInRupeesToWallet(50);
            wallet.addAmountInDollarToWallet(1);
            assertEquals(124.85, wallet.getWalletAmount("rupees"));
//            double actualCurrency = 50 + currencyConvertor.dollarToRupees(1);
//            double expectedCurrency = 124.85;
//            assertEquals(expectedCurrency, actualCurrency);
        }

        @Test
        //  Wallet wallet = new Wallet(total = 0);
        public void checkAdditionOfSeventyFourPointEightFiveRupeesAndOneDollarAndOneHundredFortyNinePointSevenIsEqualToFourDollar() {
            wallet.addAmountInRupeesToWallet(74.85);
            wallet.addAmountInDollarToWallet(1);
            wallet.addAmountInRupeesToWallet(149.7);
            assertEquals(4, wallet.getWalletAmount("dollars"));
        }
    }

    @Nested
    public class AddAmountToWallet {
        @Test
        public void addAmountToWalletInRupees() {
            wallet.addAmountInRupeesToWallet(12);
            assertEquals(12, wallet.getWalletAmount("rupees"));
            wallet.addAmountInRupeesToWallet(200);
            assertEquals(212, wallet.getWalletAmount("rupees"));
        }

        @Test
        public void addAmountToWalletInDollarAndShowTotalAmountOfWallet() {
            wallet.addAmountInDollarToWallet(2);
            assertEquals(2, wallet.getWalletAmount("dollars"));
            wallet.addAmountInDollarToWallet(2);
            assertEquals(4, wallet.getWalletAmount("dollars"));

        }
    }

    @Test
    public void checkExceptionIfGiveWrongCurrency() {
        assertThrows(IllegalArgumentException.class, () -> wallet.getWalletAmount("euro"));
    }

    @Nested
    public class WithdrawalAmountToWallet {
        @Test
        public void withdrawalAmountToWalletInRupees() {
            wallet.addAmountInRupeesToWallet(12);
            wallet.withdrawalAmountInRupeesFromWallet(2);
            assertEquals(10, wallet.getWalletAmount("rupees"));
            wallet.withdrawalAmountInRupeesFromWallet(5);
            assertEquals(5, wallet.getWalletAmount("rupees"));
        }

        @Test
        public void withdrawalAmountToWalletInDollar() {
//            currencyConvertor.addAmountInDollarToWallet(12);
//            currencyConvertor.withdrawalAmountInDollarFromWallet(5);
//            assertEquals(7,currencyConvertor.getWalletAmount("dollars") );
//            currencyConvertor.withdrawalAmountInDollarFromWallet(1);
//            assertEquals(6,currencyConvertor.getWalletAmount("dollars") );
            wallet.addAmountInDollarToWallet(15);
            wallet.withdrawalAmountInDollarFromWallet(2);
            assertEquals(13, wallet.getWalletAmount("dollars"));
            wallet.withdrawalAmountInDollarFromWallet(1);
            assertEquals(12, wallet.getWalletAmount("dollars"));
        }
    }

    @Nested
    public class checkSufficientAmount {
        @Test
        public void checkAmountInRupeesIsLessThanBalance() {
            assertThrows(IllegalArgumentException.class, () -> wallet.withdrawalAmountInRupeesFromWallet(3));
        }

        @Test
        public void checkAmountInDollarIsLessThanBalance() {
            assertThrows(IllegalArgumentException.class, () -> wallet.withdrawalAmountInDollarFromWallet(3));
        }
    }

}