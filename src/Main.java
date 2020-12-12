public class Main
{
    public static void main(String[] args)
    {
        // создание объекта типа Point3d
        Point3d gus1 = new Point3d(); // точка 1
        Point3d gus2 = new Point3d(); // точка 2
        Point3d gus3 = new Point3d(); // точка 3

        Point3d.sadPoint(gus1);
        Point3d.sadPoint(gus2);
        Point3d.sadPoint(gus3);

        // "%.2f" - форматирование; два знака после запятой; плавающая запятая.
        String str = String.format("%.2f", Point3d.computeArea(gus1,gus2,gus3));
        System.out.println(str);
    }

}
