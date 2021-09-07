import graphics.*;
public class Area
{
    public static void main(String ar[])
    {
        Square s=new Square();
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Circle c=new Circle();
        System.out.println("area of square:"+s.area(4));
        System.out.println("area of rectangle:" +r.area(2,4));
        System.out.println("area of triangle" + t.area(8,4));
        System.out.println("area of circle" + c.area(5));

    }
}

