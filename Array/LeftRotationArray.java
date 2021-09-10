import java.util.*;

public class LeftRotationArray
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
        int i;
        int temp = arr[0];
        for (i = 0; i < n - 1; i++) 
        {
            arr[i] = arr[i + 1]; // Left shift by one
        }
        arr[i] = temp; 
        System.out.print("\nAfter Rotation the elemnts are : ");
        for(i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        } 
    }
}