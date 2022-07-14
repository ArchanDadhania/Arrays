import java.util.Scanner;

public class LinearSearch
{

    public static int LinearSearch1(int [] arr, int x)
    {
       // int arr[] = takeInput();
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }

    public static int [] takeInput()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr= new int[n];
        //int x = scan.nextInt();

        for (int i=0;i<n;i++)
        {
            System.out.println("Enter element at: "+i+"th index");
            arr[i] =scan.nextInt();
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int []arr = takeInput();
        int x = 5;
        int search = LinearSearch1(arr,x);

        System.out.println("search element index is: " +search);
    }
}
