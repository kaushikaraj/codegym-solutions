import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();
        int a = Integer.parseInt(number);
          String number1 = reader.readLine();
        int b = Integer.parseInt(number1);
          String number2 = reader.readLine();
        int c = Integer.parseInt(number2);
        
        if ( ( (a+b) > c) && ( (a+c) > b) && ( (b+c) >a) )
            System.out.println("The triangle is possible.");
            else
             System.out.println("The triangle is not possible.");
        
    }
}