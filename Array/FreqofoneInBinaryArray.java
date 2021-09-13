import java.util.*;

public class FreqofoneInBinaryArray
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
        int res = 0;
        int curr = 0;
        for(int i = 0;i < n;i++)
        {
            if(arr[i] == 0)
            curr = 0;
            else 
            curr++;
            res = Math.max(res,curr);
        }
        System.out.print("\nThe Frequency is : " + res);
    }
}
