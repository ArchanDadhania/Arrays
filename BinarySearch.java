import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[], int x)
    {
        int s = 0;
        int e = arr.length - 1;

        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]>x)
            {
                e = mid -1;
            } else if (arr[mid]<x)
            {
                s = mid +1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

    public static int [] takeInput()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];

        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the element of:"+i+" position.");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {

        int arr[] = takeInput();
        int x = 5;
        int search = binarySearch(arr,x);
        System.out.printf("search element index is: " +search);
    }
}
