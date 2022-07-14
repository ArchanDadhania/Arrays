import java.util.Scanner;

public class PrintArrayPair {



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

    public static void printAllPair(int arr[])
    {
        int n = arr.length;
        for (int  i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                System.out.println("(" + arr[i] + "," +arr[j]+")");
            }
        }
    }





    public static void main(String[] args) {

        int arr[]=takeInput();
        printAllPair(arr);


    }
}
