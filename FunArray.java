import java.util.Scanner;

public class FunArray {


    public static void printArry(int []arr)
    {
        int n = arr.length;
        for (int i = 0; i<n;i++)
        {
            System.out.println("your enter element: " + arr[i]+ " at "+i+"th index");
        }
    }
    public static int [] takeInput()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i=0;i<n;i++)
        {
            System.out.println("Enter element at: "+i+"th position");
            arr[i]=scan.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] arr = takeInput();
        printArry(arr);
    }
}
