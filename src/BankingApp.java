
public class BankingApp {
    
    public static void main(String[] args) {
        
        Account ac1 = new Account();
        Account ac2 = new Account();
        Account ac3 = new Account();
        Account ac4 = new Account();

        //ac1.ano=111;        ac1.name="ABC";        ac1.balance=10000;
        ac1.setData(111, "AAA", 10000);
        ac2.setData(112, "BBB", 20000);
        ac3.setData(113, "CCC", 30000);
        ac4.setData(114, "DDD", 40000);
        ac1.showDetails();
        ac2.showDetails();
        ac3.showDetails();
        ac4.showDetails();
        //Account.showTotal();
        //ac1.showAvg(ac3);
        Account.showAvg(ac1, ac2);  //{ac1,ac2}
        Account.showAvg(ac1, ac2, ac3);//{ac1,ac2,ac3}
        Account.showAvg(ac1, ac2, ac3, ac4);
    }
}
