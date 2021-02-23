
public class Demo {

    private int x, y, z;
    
    public void test(){
        
    }
    public Demo(){
        test();
    }
    public Demo(int p,int q){
        this();
        x=p; y=q;
    }
    public Demo(int a,int b, int c){
        this(a,b);
        z=c;
    }
    public void setData(int p,int q){
        x=p;
        y=q;
    }
    public void setData(int a, int b, int c) {
        setData(a,b);
        z = c;
    }

    public void show() {
        System.out.println(x + "," + y + "," + z);
    }

    public static void main(String[] args) {
        Demo d1=new Demo(10,20,30);
        Demo d2=new Demo(30,40);
        d1.show();
        d2.show();
    }
}
