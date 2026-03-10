import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamDemo
{
    public static void main(String[] afke)
    {
        try {
            FileInputStream fin=new FileInputStream("E:\\deletefiles\\output.txt");
            int i=0;
            while((i=fin.read())!=-1)
            {
                System.out.print((char)i);
            }
            fin.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}