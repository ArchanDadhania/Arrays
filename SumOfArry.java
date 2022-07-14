import java.util.Scanner;

public class SumOfArry {


/*    public static int sum(int[] arr) {
        //Your code goes here
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 7, 8};
        System.out.println(sum(arr));
    }
}*/


    public static int [] takeInput()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at: " + i + " th element.");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int sum()
    {
        int total = 0;
        int arr[]=takeInput();
        for (int i:arr)
        {
         total = total + i;
        }
        return total;
    }
    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at: " + i + " th element.");
            arr[i] = scan.nextInt();
        }*/

        // int []arr = takeInput();

        System.out.println("totla of the insert element: " +sum());

    }

}