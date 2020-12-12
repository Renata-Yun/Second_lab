public class Point2d
// двумерный класс точки
{
    public double xCoord; // координата X
    public double yCoord; // координата Y

    // Конструктор инициализации
    public Point2d ( double x, double y)
    {
        xCoord = x;
        yCoord = y;
    }
    // Конструктор по умолчанию
    public Point2d ()
    {
        //Вызовите конструктор с двумя параметрами и определите источник
        this(0, 0);
    }
    //отдача значений координат X
    public double getX ()
    { return xCoord; }

    //отдача значений координат Y
    public double getY ()
    { return yCoord; }

    //получение нового значения координаты X
    public void setX ( double x)
    { xCoord = x; }

    //получение нового значения координаты Y
    public void setY ( double y)
    { yCoord = y; }
}

