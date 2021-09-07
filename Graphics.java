package graphics;
interface Graphics
{
    public float area(float x);
    public float area(float x,float y);
}
public class Square implements Graphics
{
    public float area(float x)
    {
        return(x*x);
    }

}
public class Rectangle implements Graphics
{
    public float area(float x,float y)
    {
        return((x*y));
    }
}
public class Triangle implements Graphics
{
    public float area(float x,float y)
    {
        return ((x*y)/2);
    }
}
public class Circle implements Graphics
{
    public float area(float x)
    {
        return (3.14f*x*x);
    }
}

