import java.util.Scanner;

class Bankaccount {
    private String accountHolder;
    private double Balance;

    public Bankaccount(String name, double curentbalance) {
        this.accountHolder = name;
        this.Balance = curentbalance;
    }

    public void Diposit(double Amount) {
        if (Amount > 0) {
            Balance += Amount;
            System.out.println("$" + Amount + "you are amount succesful Diposit.");
        } else {
            System.out.println("Invalid amoun try again");
        }
    }

    public void Withdrow(double Amount) {
        if (Amount > 0 && Amount <= Balance) {
            Balance -= Amount;
            System.out.println("$" + Amount + " successfully withdrawn.");
        } else {
            System.out.println("Invalid amount for withdraw or insufficient balance.");
        }

    }

    public void checkamount() {
        System.out.println("Account Holder Name :" + accountHolder);
        System.out.println("Currnt Balnce" + Balance);
    }

}

public class BankingApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account Holder Name :");
        String name = sc.nextLine();
        System.out.print("Enter the curent balnce this time :");
        double curentbalance = sc.nextInt();
        Bankaccount account = new Bankaccount(name, curentbalance);

        int choice;
        do {
            System.out.println("====Bank Manue===");
            System.out.println("1. Amount Diposit.");
            System.out.println("2. Amount Withdrow.");
            System.out.println("3. Check Balnce.");
            System.out.println("4. Exit.");
            System.out.println("Enter the choice number :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Diposit Amount :");
                    account.Diposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter the Withdrow Amount :");
                    account.Withdrow(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter the Check Amount :");
                    account.checkamount();
                    break;
                case 4:
                    System.out.println("Thank you for using Banking App.");
                    break;
                default:
                    System.out.println("Your choice number are invalide and Try again.");
                    break;
            }

        } while (choice != 4);
        sc.close();

    }
}