import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FavoriteColor {
    public static void main(String[] args) {
        System.out.println("What is your favorite color?");

        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputString = bufferedReader.readLine();

            System.out.println("color entered : " + inputString);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}