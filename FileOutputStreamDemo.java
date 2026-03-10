import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamDemo
{
    public static void main(String[] afke)
    {
        try {
            FileOutputStream fout=new FileOutputStream("E:\\deletefiles\\output.txt");
            String s="Hello, World!";
            byte[] b=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("text written to file successfully.");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}