import java.util.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a)
    {
        elements = new int[a.length];
        for(int i =0;i<a.length;i++)
        {
            elements[i] = a[i];
        }

    }


    public int computeDifference()
    {
        int max =1,min=100;
        for (int i=0; i < elements.length; i++)
        {
            max=((max>elements[i])?max:elements[i]);
            min=((min<elements[i])?min:elements[i]);

        }

       return  maximumDifference=(max-min);
    }
}

public class Scope{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
