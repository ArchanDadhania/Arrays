import java.util.Scanner;

public class InOutOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i=0;i<n;i++)
        {
            System.out.println("enter element at "+ i + "th index");
            arr[i]= scan.nextInt();
        }
        for (int i = 0; i<n;i++)
        {
            System.out.println("your enter element is: " +arr[i]);
        }
    }
}
