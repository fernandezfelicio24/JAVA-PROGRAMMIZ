package OOPIII.JavaExceptionsLearn.Example4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    //declaring the type of exception
    public static void findFile() throws IOException{
        //code tha may genetate IOException
        File newFile = new File("test..txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try {
            findFile();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
