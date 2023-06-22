package designPatterns.adapter.thirdParty;

public class ICICIBankAPI {
    public String doPayment(long fromId, long toId, double amount){
        System.out.println("Amount transferred");
        return "success";
    }

    public double balance(long accountId){
        //logic for checking account balance
        return 1000;
    }

    public boolean checkUser(long accountId){
        //logic for authentication
        return true;
    }
}
