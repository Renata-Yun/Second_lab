import java.util.Scanner;

public class Point3d extends Point2d //трехмерный класс точки с наследованием от Point2d
{
    public double zCoord; // координата Z

    // метод инициализации точки с координатами
    // (создание нового объекта Point3d с 3 значениями тип double)
    public Point3d(double x, double y, double z)
    {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d() // конструктор по умолчанию
    {
        this(0,0,0);
    } // создание точки в нулевой координате

    //получение нового значения координаты Z
    public void setZ(double z)
    { zCoord = z; }

    //отдача значений координат Z
    public double getZ()
    { return zCoord; }

    public boolean isSame (Point3d Tochka)
    { return (this.getX()==Tochka.getX() && this.getY()==Tochka.getY() && this.getZ()==Tochka.getZ()); }

    public double distanceTo (Point3d Tochka)
    {
        double x1 = this.getX();
        double x2 = Tochka.getX();
        double y1 = this.getY();
        double y2 = Tochka.getY();
        double z1 = this.getZ();
        double z2 = Tochka.getZ();

        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2) + Math.pow((z2-z1),2));
    }

    public static void sadPoint (Point3d Tochka)
    {
        // Ввод координат точек
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату X:");
        Tochka.setX(scanner.nextDouble());
        System.out.println("Введите координату Y:");
        Tochka.setY(scanner.nextDouble());
        System.out.println("Введите координату Z:");
        Tochka.setZ(scanner.nextDouble());
    }
    public static double computeArea(Point3d obj1, Point3d obj2, Point3d obj3)
    {
        double side1 = 0; // сторона 1
        double side2 = 0; // сторона 2
        double side3 = 0; // сторона 3
        double s = 0; // площадь
        double p = 0; // полупериметр

        if (obj1.isSame(obj2) || obj1.isSame(obj3) || obj2.isSame(obj3))
            System.out.println("Имеются две или более одинаковых точек");
        else
        {
            // находим расстояние от точки 1 до точки 2
            side1 = obj1.distanceTo(obj2);
            // находим расстояние от точки 1 до точки 3
            side2 = obj1.distanceTo(obj3);
            // находим расстояние от точки 2 до точки 3
            side3 = obj2.distanceTo(obj3);
            // получаем значение полупериметра
            p = (side1 + side2 + side3)/2;
            // находим площадь по формуле Герона
            s = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        }
        return s;
    }
}
