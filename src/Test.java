
public class Test {

    private int a, b;           //instance (non-static)
    private static int x, y;    //class    (static)
    
    public static void main(String[] args) {
        
        //instantiating class Test
        Test t1=new Test(); //will create one instance(object)
        Test t2=new Test(); //will create one more instance (object)
        Test t3=new Test(); //will create one more instance (object)
        t1.a=10;
        t2.a=20;
        t3.a=30;
        
        System.out.println(t1.a);
        System.out.println(t2.a);
        System.out.println(t3.a);
        
        System.out.println("_____________________________________");
        
        t1.x=50;
        t2.x=60;
        t3.x=70;
        
        System.out.println(t1.x);
        System.out.println(t2.x);
        System.out.println(t3.x);
        
        
        
        
    }
}
