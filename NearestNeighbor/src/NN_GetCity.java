import java.io.*;


public class NN_GetCity {
    public  double[][] locationMatrix;
    public  void CityCaller() throws IOException {


        BufferedReader Cities = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/ca4663.txt"));
        LineNumberReader lineReader = new LineNumberReader(Cities);
        BufferedReader Cities2 = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/ca4663.txt"));
        LineNumberReader lineReader2 = new LineNumberReader(Cities2);
        String C;

        int row = 0,col=2;




        while(lineReader.readLine() !=null)  {
            row++;
        }
        Cities.close();



        locationMatrix =new double[row-8][col];

        row=0;

        while ((C = lineReader2.readLine()) != null){
        if(C.equals("EOF")){
            break;
        }

            if(lineReader2.getLineNumber()>7){
                String[] split = C.split(" ");


                locationMatrix[row][0]=Double.parseDouble(split[1]);
                locationMatrix[row][1]=Double.parseDouble(split[2]);


                row++;

            }


        }
        Cities2.close();

        /*for (double[] matrix : locationMatrix) {
            System.out.print(matrix[0]);
            System.out.print("  ");
            System.out.print(matrix[1]);
            System.out.println();

        }*/


    }
        }







