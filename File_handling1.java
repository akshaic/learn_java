import java.io.File;
import java.util.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;


class File_reader_writer
{
void writeFile()
{

  try {
            File obj = new File("./file1.txt");
            if (obj.createNewFile()) {
                System.out.println("File created: "
                                   + obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
            }
   String str="I am Akshai Benny"; 
   try
   {                  
   obj.write("I am Akshai Benny");
   System.out.println("Writing successful...");
   }
   catch(IOException e)
   {
    System.out.println("File not found!!");
   }
   finally
   {
   obj.close();
   }
}
     

/*void readFile()
{   
    int ch;
    try
    {
    FileReader fr=new FileReader("file1.txt");
    ch=fr.read();
    while (ch!=-1) 
    {
            System.out.print((char)ch);
            ch=fr.read();
    }
    }
    catch (fe) 
        { 
            System.out.println("File not found"); 
        }
    finally
        {fr.close();}
}*/
}


class File_handling1
{
public static void main(String args[])
{
File_reader_writer ob=new File_reader_writer();
ob.writeFile();
//ob.readFile();
}
}
