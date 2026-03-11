import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExample
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fin = new FileInputStream("E:\\deletefiles\\input.txt");
            int i;
            int count = 0;

            while((i = fin.read()) != -1)
            {
                count++;
            }

            System.out.println("Total characters in file: " + count);
            fin.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}