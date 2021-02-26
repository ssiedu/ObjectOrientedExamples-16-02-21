public class Test {

    private int a, b;           

    public Test(int x, int y){a=x;b=y;}
    public void show(){System.out.println(a+","+b);}
    
    public static void main(String[] args) {
        
        
        Test t1=new Test(10,20);
        Test t2=t1;
        
        
        System.out.println(t1.a);
        System.out.println(t2.a);
        
        t1=new Test(30,40);
        System.out.println("______________________________");
        System.out.println(t1.a);
        System.out.println(t2.a);
        t2=new Test(50,60);
        System.out.println("______________________________");
        System.out.println(t1.a);
        System.out.println(t2.a);
        
    }
        
}
