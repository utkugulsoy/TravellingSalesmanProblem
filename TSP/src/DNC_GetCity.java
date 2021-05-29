import java.io.*;


public class DNC_GetCity {

        public static void CityCaller() throws IOException {


            BufferedReader Cities = new BufferedReader(new FileReader("C:\\Users\\mehme\\IdeaProjects\\TSP-DNC\\ca4663.txt"));
            LineNumberReader lineReader = new LineNumberReader(Cities);
            String C;


            while((C=lineReader.readLine())!=null)  {
                if(lineReader.getLineNumber()>7){
                    String[] split = C.split(" ");
                    System.out.println("x axis : " + split[1] + " y axis : " + " " + split[2]);
                }
            }
            Cities.close();

        }
}

