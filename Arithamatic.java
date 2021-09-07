package arithamatic;
public interface Arithamatic
{
    public int add(int a,int b);
    public int sub(int a,int b);
    public int mul(int a,int b);
    public int div(int a,int b);

}
public class Test implements Arithamatic
{
    public int add(int a,int b)
    {
        return(a+b);
    }
    public int sub(int a,int b){
        return (a-b);
    }
    public int mul(int a,int b){
        return (a*b);
    }
    public int div(int a,int b){
        return (a/b);
    }
}
