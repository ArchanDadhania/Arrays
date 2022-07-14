import java.util.Scanner;

public class LargestElement {


    public static int [] takeInput()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr= new int[n];

        for (int i=0;i<n;i++)
        {
            System.out.println("Enter element at: "+i+"th index");
            arr[i] =scan.nextInt();
        }
        return arr;
    }

    public static int largest(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr = takeInput();
        int lar = largest(arr);
        System.out.println(lar);
    }
}
