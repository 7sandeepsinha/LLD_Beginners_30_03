package designPatterns.adapter;

public class PhonePe {
    private BankAPIAdapter bankAPIAdapter;

    public PhonePe() {
        bankAPIAdapter = new YesBankAdapter();
    }

    public String transferMoney(String fromUserName, String toUserName,
                                double amount){
        String result = bankAPIAdapter.transfer(fromUserName, toUserName, (int)amount);
        return result;
    }


    public double checkBalance(String userName){
        return bankAPIAdapter.checkBalance(userName);
    }

    public boolean login(String userName){
        return bankAPIAdapter.authenticate(userName);
    }
}
