public class Circle {

    //properties of circle object
    private double radius;
    private double area;
    
    //operations on circle object
    public void setRadius(double r){
        radius=r;
    }
    public void computeArea(){
        area=3.14*radius*radius;
        System.out.println("Area of circle with a radius "+radius+" : "+area);
    }
    
}
