import java.util.Scanner;

public class HourGlass
{

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String args[])
    {
        int sum=0,maxSum=-900,row=0,column=0;

        int[][] arr= new int[6][6];

        for (int i = 0; i < 6; i++)
        {
            String[] arrRowItems = scan.nextLine().split(" ");
            scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for(int j=0; j < arrRowItems.length; j++) {

                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;

            }
        }
        scan.close();

    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
           System.out.println(arr[i][j]+" "+arr[i][j+1]+" "+arr[i][j+2]+"\n"+
                "  "+arr[i+1][j+1]+"\n"+
                   arr[i+2][j]+" "+arr[i+2][j+1]+" "+arr[i+2][j+2]+"\n");

            sum =(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+
                    arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
            System.out.println(sum);
               if(sum>maxSum)
            {
                maxSum=sum;
            }

        }
        }
        System.out.println(maxSum);
    }

}
