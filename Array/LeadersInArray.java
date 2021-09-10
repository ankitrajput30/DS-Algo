import java.util.*;

public class LeadersInArray //Leaders in Array means the element after that no elements are greater on right Side. 
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
        int curr_ldr = arr[n-1];
        System.out.println("\nThe Leaders in Array is : ");
        System.out.println("" + curr_ldr);
        for(int i = n-2;i >= 0;i--)
        {
            if(curr_ldr < arr[i])
            {
                curr_ldr = arr[i];
                System.out.println("" + curr_ldr);
            }
        }
    }
} 