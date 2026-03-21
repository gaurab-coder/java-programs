import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWriteDemo
{
    public static void main(String[] args)
    {
        try
        {
            // Writing to file
            FileWriter filewriter = new FileWriter("E:\\deletefiles\\filename.txt");
            String str = "Say Hello to File Writer";
            filewriter.write(str);
            filewriter.close();

            System.out.println("Data written successfully!");

            // Reading from file
            FileReader filereader = new FileReader("E:\\deletefiles\\filename.txt");

            int i;
            while((i = filereader.read()) != -1)
            {
                System.out.print((char)i);
            }

            filereader.close();
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}