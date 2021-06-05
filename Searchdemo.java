import java.io.*;
import java.util.Scanner;
class Search
{
    int a[]={1,3,5,7,9};
    void search()
    {
        boolean flag=false;
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter key value:");
        key=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                flag=true;
            }
        }
        if(flag==true)
            System.out.println(key+""+"found");
        else
            System.out.println(key+""+"not found");
    }

}
public class Searchdemo
{
    public static void main(String args[])
    {
      Search ob1=new Search();
      ob1.search();
    }
}
