
public class Circle {

    //properties of circle object
    private double radius;
    private double area;

    
    public boolean equals(Circle tmp){
        if(radius==tmp.radius){
            return true;
        }else{
            return false;
        }
    }
    //operations on circle object
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        area = 3.14 * radius * radius;
        System.out.println("Area of circle with a radius " + radius + " : " + area);
    }

    public static void main(String[] args) {

        Circle c1=new Circle(10);
        Circle c2=new Circle(10);
        Circle c3=c2;       //we are creating a new ref c3 and this new ref will point to object pointed by c2
    
             
        System.out.println(c1==c2);
        System.out.println(c1.equals(c3));
        
    }

}
