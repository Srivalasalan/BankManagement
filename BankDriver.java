import java.util.Scanner;

public class BankDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank b1 = new Bank(null );
        boolean exit =true;
    while(exit){
        System.out.println("1.Create an Account\n2.Balance Enquiry\n3.Withdraw\n4.Change Password\n5.Deposit\n6.Exit");
        int choice =scan.nextInt();

        switch (choice) {
            case 1:{
                System.out.print("Enter Your Name: ");
                String name=scan.next();
                System.out.print("Enter Your Balance: ");
                double balance = scan.nextDouble();
                System.out.print("Enter Your Password (only numbers): ");
                int pass = scan.nextInt(); 
                System.out.print("Enter Account Number: ");
                long acc=scan.nextLong();
                b1.createAccount(new Account(balance, pass, acc, new User(name)));

            }
                
                break;

            case 2:{
                System.out.print("Enter Your Password: ");
                int pass=scan.nextInt();
                b1.balanceEnquiry(pass);

            }break;

            case 3:{
                System.out.print("Enter Your Password: ");
                int pass=scan.nextInt();
                System.out.print("Enter Amount to Withdraw: ");
                double amount = scan.nextDouble();
                b1.withdraw(pass, amount);

            }break;

            case 4:{
                System.out.print("Enter the Old Password: ");
                int pass=scan.nextInt();
                System.out.print("Enter the New Password: ");
                int newPass=scan.nextInt();
                b1.changePassword(pass, newPass);

            }break;

            case 5:{
                System.out.print("Enter the Password: ");
                int pass = scan.nextInt();
                System.out.print("Enter the Amount to Deposit: ");
                double amount = scan.nextDouble();
                b1.deposit(pass, amount);

            }break;

            case 6:{
                exit=false;
                System.out.println("Thanks for using our Banking System!");

            }break;
        
            default:
            System.out.print("Invalid Choice!\nEnter a Valid Choice: ");
                break;
        }

        
    }
    scan.close();
    }
}
