import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo
{
    public static void main(String[] argue)
    {
        try
        {
            FileWriter filewriter=new FileWriter("E:\\deletefiles\\filename.txt");
            String str="Say Hello to file Writer";
            filewriter.write(str);
            filewriter.close();
            System.out.println("Data to the file is written successfully");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}