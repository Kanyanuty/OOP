package week6method;

public class Tests4_4 {
    public static void main(String[] args)
    {
        double radius = 10.5;
        Tests4_4 circle = new Tests4_4();
        System.out.println("Circle radius = " + radius );
        System.out.println("Area circle = " + circle.Area(radius) );
    }
    public double Area(double radius)
    {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
