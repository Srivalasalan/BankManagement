public class Bank implements ATM {
    Account a;
    Bank(Account a)
    {
        this.a=a;
    }

    public void createAccount(Account a){
       if (this.a != null && this.a.u.userName != null) {
            System.out.println("Account already exists!");
        } else {
            this.a = a;
            System.out.println("Account created successfully for " + a.u.userName);
            
        }
    }

    public void withdraw(int pwd, double amount){
    if (this.a == null) {
        try {
            throw new createAccountException();
        } catch (createAccountException e) {
            System.out.println("Create an Account First");
        }
        return;
    }
    if(a.pwd == pwd && amount > 0){
        if(amount > a.availableBalance){
            try {
                throw new insufficientBalanceException();
            } catch (insufficientBalanceException e) {
                System.out.println("Insufficient Balance");
            }
            return;
        }
        a.availableBalance -= amount;
        System.out.println("Withdraw Done");
        System.out.println("Available Balance: " + a.availableBalance);
    } else {
        System.out.println("Password is Incorrect or Invalid Amount");
    }
}

public void changePassword(int oldPwd, int newPwd){
    if (this.a == null) {
        try {
            throw new createAccountException();
        } catch (createAccountException e) {
            System.out.println("Create an Account First");
        }
        return;
    }
    if (oldPwd != a.pwd) {
        try {
            throw new incorrectPasswordException();
        } catch (incorrectPasswordException e) {
            System.out.println("The Password is Incorrect");
        }
        return;
    }
    a.pwd = newPwd;
    System.out.println("Password changed successfully!");
}


public void deposit(int pwd, double amount){
    if (this.a == null) {
        try {
            throw new createAccountException();
        } catch (createAccountException e) {
            System.out.println("Create an Account First");
        }
        return;
    }
    if (pwd != a.pwd) {
        try {
            throw new incorrectPasswordException();
        } catch (incorrectPasswordException e) {
            System.out.println("The Password is Incorrect");
        }
        return;
    }
    if (amount <= 0) {
        try {
            throw new insufficientAmountException();
        } catch (insufficientAmountException e) {
            System.out.println("Amount Cannot be lesser or equal to 0.");
        }
        return;
    }
    a.availableBalance += amount;
    System.out.println("Amount Deposited");
    System.out.println("Available Balance: " + a.availableBalance);
}


 public void balanceEnquiry(int pwd){
    if (this.a == null) {
        try {
            throw new createAccountException();
        } catch (createAccountException e) {
            System.out.println("Create an Account First");
        }
        return;
    }
    if (pwd != a.pwd) {
        try {
            throw new incorrectPasswordException();
        } catch (incorrectPasswordException e) {
            System.out.println("The Password is Incorrect");
        }
        return;
    }
    System.out.println("Available Balance: " + a.availableBalance);
}

}




