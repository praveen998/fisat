

class InvalidData extends Exception
{
 InvalidData()
 {
     System.out.println("invalid data");
 }
}
public class Authenticate
{
    String s="praveen";
    int password=1234;
    void user(String str,int pass)throws InvalidData
    {
        if(str.equals(s) || password==pass)
        {
            System.out.println("valid");
        }
        else
        {
            throw new InvalidData();
        }

    }
    public static void main(String[] args)
    {
        
        Authenticate obj=new Authenticate();
        try {
            obj.user("prav",12);
           }catch (InvalidData e)
        {
           
        }

    }

}

