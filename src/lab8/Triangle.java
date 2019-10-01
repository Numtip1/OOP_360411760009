package lab8;

public class Triangle extends  GraphicOject {

    //attributes
    private double b;
    private double h;


    //constructor
    public  Triangle (){}
    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    void findArea() {
        double triangle = 0.5 * (b * h);
        System.out.println("the area of triangle :" + super.area);

    }
    //getter and setter


    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

}

