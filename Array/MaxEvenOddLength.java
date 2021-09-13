import java.util.*;

public class MaxEvenOddLength
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
        int res = 1;
        int curr = 1;
        for(int i = 1;i < n;i++)
        {
            if((arr[i] % 2 == 0 && arr[i-1] % 2 != 0) || 
            (arr[i] % 2 != 0 && arr[i-1] % 2 == 0))
            {
                curr++;
                res = Math.max(res,curr);
            }
            else
            {
                curr = 1;
            }
        }
        System.out.print("\nThe Max length is : " + res);
    }
}
