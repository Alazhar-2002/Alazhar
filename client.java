import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class client21s20819 implements Runnable
{

    public void run()
    {
        try{
            Socket Alazhars=new Socket("localhost",5650);
            
            Scanner said=new Scanner(System.in);
            System.out.println("Enter the  code:");
            int Alcode=said.nextInt();
            
             System.out.println("Enter the r.q:");
             int Arq=said.nextInt();
             
             DataOutputStream Aldos=new DataOutputStream(Alazhars.getOutputStream());
             Aldos.writeInt(Alcode);
              Aldos.writeInt(Arq);
               
              DataInputStream Aldis=new DataInputStream(Alazhars.getInputStream());
             
              String Asname=Aldis.readUTF();
              double Asprice=Aldis.readDouble();
              
               System.out.println("The name:"+Asname); 
               System.out.println("pris is:"+Asprice);
               
               
        }
        
        catch(IOException e)
        {System.out.println(e);
        }
    }   
}















