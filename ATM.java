interface ATM {

    void createAccount (Account a);
    void balanceEnquiry(int pwd);
    void withdraw(int pwd,double amount);
    void changePassword(int oldPwd,int newPwd);
    void deposit(int pwd,double amount);
    
}
