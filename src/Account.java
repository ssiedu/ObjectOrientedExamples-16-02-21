public class Account {
    private int ano;
    private String name;
    private int bal;
    private static int total;
    
    public static void showAvg(Account tmp1, Account tmp2){
        System.out.println("Avg of 2 : "+(tmp1.bal+tmp2.bal)/2);
    }
    
    public static void showTotal(){
        System.out.println("Total Balance : "+total);
    }
    public  void showDetails(){
        System.out.println("Account Number : "+ano);
        System.out.println("Customer Name  : "+name);
        System.out.println("Balance    Rs. : "+bal);
        System.out.println("_________________________________________________________");
    }
    public void setData(int a, String b, int c){
        ano=a;      //reading the local variable a and writing it to instance var ano
        name=b;
        bal=c;
        total=total+c;
    }
}
