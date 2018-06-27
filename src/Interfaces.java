import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
//Edit from next line only
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {

        int sum=n;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }

        }
        return sum;

    }
}
//Do not edit next lines
public class Interfaces
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
