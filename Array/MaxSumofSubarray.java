import java.util.*;

public class MaxSumofSubarray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Elements :");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements :");
        for(int i = 0;i < n;i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.print("The elemnts are : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
        int sum = 0;
        int res = 0;
        int maxend  = 0;
        for(int i = 1;i < n;i++)
        {
            maxend = Math.max(maxend + arr[i],arr[i]);
            res = Math.max(res,maxend);
        }
         System.out.print("\nThe Max Sum of SubArray is : " + res);
    }
}
