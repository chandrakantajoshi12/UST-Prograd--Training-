import java.util.Scanner;

   class BankDetails {
    public String accno;
    public String name;
    private long balance;
    public String acc_type;

    Scanner scan = new Scanner(System.in);

    public void openAccount() {
        System.out.println("Enter Account no");
        accno = scan.nextLine();
        System.out.println("Enter name");
        name = scan.nextLine();
        System.out.println("Enter Balance");
        balance = scan.nextLong();
        System.out.println("Enter Account Type");
        acc_type =scan.nextLine();
    }

    public void show() {
        System.out.println("Name " + name);
        System.out.println("AccountNo " + accno);
        System.out.println("Balance " + balance);
        System.out.println("Account type"+ acc_type);
    }

    public void withdrow() {
        long amt;
        System.out.println("Enter the withdrow amount");
        amt = scan.nextLong();
        if (balance >= amt) {
            balance = balance - amt;

        } else {
            System.out.println("Your balance is less");
        }
    }

    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            show();
            return (true);
        }
        return (false);
    }

    public double deposit() {
        long amt;
        System.out.println("Enter the amount");
        amt = scan.nextLong();
        balance = balance + amt;
        return balance;
    }

}
public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number of customers");
        int n = sc.nextInt();
        BankDetails c[] = new BankDetails[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = new BankDetails();
            c[i].openAccount();

        }
        int in;
        do {
            System.out.println("Banking System Application");
            System.out.println("Enter Input");
            System.out.println("1.show\n 2.Search Account number \n3.Deposit  \n 4.withdraw");
            in = sc.nextInt();
            switch (in) {
                case 1:
                    for (int i = 0; i < c.length; i++)
                        c[i].show();
                    break;
                case 2:
                    System.out.println("Enter Account no .");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < c.length; i++) {
                        found=c[i].search(ac_no);
                        if(found) {
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("Search failed Account doesn't exist");
                    }
                    break;
                case 3:
                    System.out.println("Enter Account no: ");
                    ac_no=sc.next();
                    found= false;
                    for(int i=0;i< c.length;i++) {

                        found=c[i].search(ac_no);
                        if(found ){
                            c[i].deposit();
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("search failed Account doesn't exist");
                    }
                    break;
                case 4:
                    System.out.println("Enter Account No:");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < c.length; i++) {
                        found = c[i].search(ac_no);
                        if (found) {
                            c[i].withdrow();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed Account doesn't exist");
                    }
                    break;
                default:
                    System.out.println("Thank you ");
                    break;
            }

        }
        while (in != 5) ;
    }
}












