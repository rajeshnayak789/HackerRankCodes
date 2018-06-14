import java.util.Scanner;

public class Exception {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        try {
            int num = Integer.parseInt(S);
            System.out.print(num);
        }
        catch (NumberFormatException e)
        {
            System.out.print("Bad String");
        }



    }

}
