package TestNG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class TestFileRead {

    //@Test
    public void Test01() throws IOException {
        BufferedReader reader= new BufferedReader(new FileReader("C:\\Users\\Sadashiva Ashok\\Desktop\\Jmeter\\SmsMemoryLeak\\smsdPid.txt"));
        String line=reader.readLine();
        String PID="";
        while(line!=null){
            if(line.contains("smsd")){
                String[] sp = line.split("\\s+");
                System.out.println("The content in the jenkins file is "+sp[1]);
                PID=sp[1];
            }
            line=reader.readLine();
        }
        reader.close();
    }
}
