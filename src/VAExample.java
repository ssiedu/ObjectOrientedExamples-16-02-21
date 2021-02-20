
public class VAExample {

    public static void add(){
        System.out.println("NOTHING TO ADD.......!!");
    }
    public static void add(int a, int b){
        System.out.println("ADDITION  : "+(a+b));
    }
    public static void add(String...v){
        String res="";
        for(String tmp:v){
            res=res+tmp;
        }
        System.out.println(res);
    }
    public static void add(int... v){
        int sum=0;
        for(int tmp:v){
            sum=sum+tmp;
        }
        System.out.println("SUM = "+sum);
    }
    
    public static void main(String[] args) {
        add();      //add(int...) , add(string...), add()
        add(10,20);
        add(10,20,30);
        add(10,20,30,40);
        add("aa","bb");
        add("xx","yy","zz");
    }
}
/*
    1) only one varargs per method
    2) normal parameters can be taken with varargs
    3) varargs must be always on last position
    4) varargs method can be overloaded.
    5) when multiple matches are there preference is given to exact match.
*/