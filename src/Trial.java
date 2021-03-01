
public class Trial {

    private int x, y;

    public Trial(int x, int y) {
        this.x = x;         //this.x => instance var,       x=>local var(parameter)
        this.y = y;
    }

    public void disp() {
        int x=55;
        System.out.println(x);      //local x
        System.out.println(this.x);  //instance var x
        System.out.println(y);  //invoking object
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {

        Trial t1=new Trial(10,20);
        Trial t2=new Trial(30,40);
        t1.disp();
        t2.disp();
    }
}
