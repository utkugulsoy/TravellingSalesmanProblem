import java.io.IOException;
import java.lang.Math;
import java.util.ArrayList;


public class NN_Body {
    public ArrayList<Integer> routeCopy=new ArrayList<>();
    int closestCity;


    double xDist, yDist, totalDist, minDist;
    int k = 0;

    boolean elem=false;
    int[] route = new int[4664];
    double tourLength=0;

    public void NN_Calculator(int StartCity) throws IOException {
        NN_GetCity cities = new NN_GetCity();
        cities.CityCaller();

        double[] distances = new double[cities.locationMatrix.length];

        for (int j = 0; j < cities.locationMatrix.length; j++) {
            if(j==0){
                minDist=Integer.MAX_VALUE;
            }
            if (!isElement(j)) {


                route[k] = StartCity;

                xDist = cities.locationMatrix[StartCity][0] - cities.locationMatrix[j][0];
                yDist = cities.locationMatrix[StartCity][1] - cities.locationMatrix[j][1];
                totalDist = Math.sqrt((xDist * xDist) + (yDist * yDist));
                distances[j] = totalDist;

                if (totalDist < minDist && totalDist != 0) {

                    minDist = totalDist;
                    closestCity = j;


                }

            }

        }


        k++;
        //System.out.println(minDist);

            //System.out.println(k);
if(k<4664) {
    route[k] = closestCity;

    routeCopy.add(closestCity);
    tourLength=tourLength+minDist;
    NN_Calculator(closestCity);
}
    }

    public boolean isElement(int param) {
       elem=false;
        for (int i = 0; i < routeCopy.size(); i++) {
            if (routeCopy.get(i) == param){
                elem=true;
                break;
            }

        }
        return elem;
    }
}





