import java.util.*;

public class ChekArraySort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Elements");
        n = input.nextInt();
        int arr[] = new int[100];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.print("The elemnts are : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
        boolean flag = true;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                flag=true;
                continue;
            }
            else 
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("\nThe Entered Array is Sorted");
        }
        else
        {
            System.out.println("\nThe Entered Array is UnSorted");
        }
    }
}