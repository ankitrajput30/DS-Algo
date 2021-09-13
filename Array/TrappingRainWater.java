import java.util.*;

public class TrappingRainWater
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
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0] = arr[0];
        for(int i = 1;i < n;i++)
        {
            lmax[i] = Math.max(lmax[i-1],arr[i]);
        }
        rmax[n-1] = arr[n-1];
        for(int i = n-2;i >= 0;i--)
        {
            rmax[i] = Math.max(rmax[i+1],arr[i]);
        }
        for(int i = 1;i < n;i++)
        {
            res = res + Math.min(lmax[i],rmax[i])-arr[i];
        }
        System.out.print("\nThe Result is : " + res);
    }
}
