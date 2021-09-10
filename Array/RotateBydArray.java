import java.util.*;

public class RotateBydArray
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
        int i,d;
        System.out.print("\nEnter how many times you want the Rotation : ");
        d = input.nextInt();
        int temp[] = new int[100];
        for (i = 0; i < d; i++) 
        {
            temp[i] = arr[i];
        }
        for(i = d;i < n;i++)
        {
            arr[i-d] = arr[i];
        }
        for(i = 0;i < d;i++)
        {
            arr[n-d+i] = temp[i];
        }
        System.out.print("\nAfter Rotation the elemnts are : ");
        for(i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        } 
    }
}
