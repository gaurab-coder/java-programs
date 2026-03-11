import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class BufferedOutputStreamDemo
{
    public static void main(String[] args)
    {
        try {
            FileOutputStream fos = new FileOutputStream(("E:\\deletefiles\\test.txt"));
            BufferedOutputStream bos =new BufferedOutputStream(fos);
            String s="Hello this is BufferedOutputStream";
            byte b[]=s.getBytes();
            bos.write(b);
            bos.flush();
            bos.close();
            bos.close();
            System.out.println("data is written to the file");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}