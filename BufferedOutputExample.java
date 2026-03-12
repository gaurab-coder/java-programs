import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputExample
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("E:\\deletefiles\\sample.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            String text = "Java Buffered Output Stream Example";

            for(int i = 0; i < text.length(); i++)
            {
                bos.write(text.charAt(i));
            }

            bos.flush();
            bos.close();

            System.out.println("Data written successfully.");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}