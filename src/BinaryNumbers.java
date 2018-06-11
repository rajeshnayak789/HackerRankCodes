import java.util.Scanner;

public class BinaryNumbers {
    private static Scanner scan=new Scanner(System.in);
    public  static void main(String args[])
    {
        int n= scan.nextInt();
        int count=0;
        int maxCount=0;
        String bin = Integer.toBinaryString(n);
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1')
            {
                count++;
                if(count>maxCount)
                {
                    maxCount=count;
                }
            }
            else
            {
                count=0;
            }

        }
        System.out.print(maxCount);

        scan.close();
    }
}
