public class Account {
    private int ano;
    private String name;
    private int bal;
    
    public void showDetails(){
        System.out.println("Account Number : "+ano);
        System.out.println("Customer Name  : "+name);
        System.out.println("Balance    Rs. : "+bal);
        System.out.println("_________________________________________________________");
    }
    public void setData(int a, String b, int c){
        ano=a;      //reading the local variable a and writing it to instance var ano
        name=b;
        bal=c;
    }
}
