public class Account {
    double availableBalance;
    int pwd;
    long acc_No;
    User u;

    Account(double availableBalance, int pwd, long acc_No,User u){
        this.availableBalance=availableBalance;
        this.pwd=pwd;
        this.acc_No=acc_No;
        this.u=u;
    }

}
