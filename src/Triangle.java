public class Triangle extends Figure {
    //берем прямоугольный треугольник
    double a;
    double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
            }

    @Override
    public double Square() {
        double square = 0.5 * a * b;
        return square;
    }

    @Override
    public double Perimetr() {
        double result =Math.sqrt(a*a+b*b)+a+b;
        double perimetr = Math.ceil(result);
        return perimetr;
    }
}
