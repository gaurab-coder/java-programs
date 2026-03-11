import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputExample
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis = new FileInputStream("E:\\deletefiles\\sample.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            int count = 0;

            while((i = bis.read()) != -1)
            {
                count++;
            }

            System.out.println("Total characters in file: " + count);

            bis.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}