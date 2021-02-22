
public class Demo {

    private int x, y, z;

    
    public Demo(){}
    public Demo(int a,int b, int c){
        x=a; y=b; z=c;
    }
    public void setData(int a, int b, int c){
        x=a; y=b; z=c;
    }
    public void show(){
        System.out.println(x+","+y+","+z);
    }
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.setData(10, 20, 30);
        d1.show();
        
        Demo d2=new Demo(40,50,60);
        d2.show();
        
        
        
    }
}
