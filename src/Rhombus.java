public class Rhombus {
    public double calcRadius(double side, double alfa){
        
        double rad = alfa * Math.PI / 180;
        double radius = 0.5 * side * Math.sin(rad);
        
        return radius;
    }
}
