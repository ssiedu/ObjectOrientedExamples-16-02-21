public class Account {
    private int ano;
    private String name;
    private int bal;
    private static int total;
    
    public Account(){}
    public Account(int a, String b, int c){
        ano=a;      
        name=b;
        bal=c;
        total=total+c;
    }
    
    
    public static void showAvg(Account... tmp){
        int sum=0;
        
        for(int i=0; i<tmp.length; i++){
            sum=sum+tmp[i].bal;
        }
        
        System.out.println("Avg Bal : "+sum/tmp.length);
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
