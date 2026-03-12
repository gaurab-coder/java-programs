import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo
{
    public static void main(String fjd[])
    {
        try 
        {
            FileReader filereader=new FileReader("E:\\deletefiles\\filename2.txt");
            // char c=(char)fileReader.read();
            // System.out.println(c);
            int i;
            while((i=filereader.read()!=-1))
                System.out.print((char)i);
            filereader.close();
        }
        catch(IOException e)
        {
            System.out.println("Error:"+e.getMessage());
        }
    }
}