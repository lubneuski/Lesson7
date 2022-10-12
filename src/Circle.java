public class Circle extends Figure {

    double r;

    public Circle(double r) {
        this.r=r;
    }

    @Override
    public double Square() {
        double result =Math.PI*r*r;
        double square = Math.ceil(result);
       //      String square = String.format("%.3f",square1);
        return square;
    }

    @Override
    public double Perimetr() {
        double result =Math.PI*2*r;
        double perimetr = Math.ceil(result);
        return perimetr;
    }
}
