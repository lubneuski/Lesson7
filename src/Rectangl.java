public class Rectangl extends Figure {

    double a;
    double b;

    public Rectangl(double a, double b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double Square() {
        double square = a*b;
        return square;
    }

    @Override
    public double Perimetr() {
        double perimetr =(a+b)*2;
        return perimetr;
    }
}
