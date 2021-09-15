import java.util.*;

public class LastOccurance
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n,flag=0;
        System.out.println("Enter the number of Elements");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the Element to be Searched");
        int x = input.nextInt();
        int low = 0;
        int high = n-1;
        int index = -1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] <= x)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
            if(arr[mid] == x)
            {
                index = mid;
            }
        }
        System.out.print("Position of "+x +" is "+index);
    }
}
