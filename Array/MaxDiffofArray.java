import java.util.*;

public class MaxDiffofArray
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
        int res = arr[1] - arr[0];
        int min_val = arr[0];

        for(int j = 1;j < n;j++)
        {
            if (arr[j] - min_val > res)
                res = arr[j] - min_val;
            if (arr[j] < min_val)
                min_val = arr[j];
        }
        System.out.print("\nThe Max.Difference of Array is : ");
        System.out.print(""+ res);
    }
}