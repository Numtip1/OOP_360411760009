package lab8;

public class Circle extends GraphicOject{
    //attributes
    private double r;
    static  double PI =3.141;

    //constructor
    public Circle (){}
    public  Circle (double r) {
        this.r =r;
    }

    @Override
    void findArea() {
        super.area = PI * (r*r);
        System.out.println("the area of Circle:"+ super.area);

    }
    //getter and setter


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public static double getPI() {
        return PI;
    }


}
