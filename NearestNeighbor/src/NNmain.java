import java.io.IOException;

public class NNmain {
    public static void main(String[] args) throws IOException {

        for(int i=0; i<4663; i++) {
            NN_Body body = new NN_Body();


            body.NN_Calculator(i);

            System.out.println(body.tourLength);

        }

    }
}
