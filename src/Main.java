public class Main {

    public static void main(String[] args) {

        task1();
 //       task2(); //Не доделано
    }
    private static void task1() {
        System.out.println("""
                \nЗадание 1. Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
                Реализовать функциюю подсчета площади для каждого типа фигуры и подсчет периметра. Создать массив из 5 фигур.
                Вывести на экран сумму периметра всех фигур в массиве.\n""");

        Figure[] f = new Figure[5];
        f[0]=new Circle(8);
        f[1]=new Circle(3);
        f[2]=new Rectangl(6,9);
        f[3]=new Triangle(11, 6);
        f[4]=new Triangle(22,15);

        double sum1=0;
        double sum2=0;

        for (int i = 0; i < f.length; i++) {
            Figure fig = f[i];
            System.out.println("Площадь "+ i+" = " + fig.Square()+" см2");
            System.out.println("Периметр "+ i+" = " + fig.Perimetr()+" см2\n");
            sum1 += fig.Square();
            sum2 += fig.Perimetr();

        }
        System.out.println("Общая площадь = "+sum1+" см2");
        System.out.println("Общий периметр = "+sum2+" см2");


    }

    private static void task2() {
        System.out.println("""
                \nЗадание 2. Создать классы "Директор", "Рабочий", "Бухгалтер".
                Реализовать интерфейс с методом, который печатает название 
                должности и имплементировать этот метод в созданные классы..\n""");


        Director d=new Director();
        Worker w=new Worker();
        Buhgalter b=new Buhgalter();

        d.job();
        w.job();
        b.job();

    }
}