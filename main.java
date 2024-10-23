import java.sql.Connection;
import java.sql.DriverManager;

public class main
{
   public static void main(String[] args) 
   {
    Connection con=null;
   try 
   {
    Class.forName("mysql.jdbc.driver.DriverManager");
   con = DriverManager.getConnection("jdb:mysql://localhost:3306/jfs", "root", "sai@2002");
   System.out.println("done connection");
   }
    catch (Exception e)
    {
      e.printStackTrace();
    } 
   }
}