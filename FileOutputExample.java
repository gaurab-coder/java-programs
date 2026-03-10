import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fout = new FileOutputStream("E:\\deletefiles\\data.txt");

            String text = "Java Programming";

            for(int i = 0; i < text.length(); i++)
            {
                fout.write(text.charAt(i));
            }

            fout.close();
            System.out.println("Data written successfully.");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}