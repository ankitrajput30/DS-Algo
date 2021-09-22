import java.util.*;

public class CountOccurance
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
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(x == arr[i])
            {
                count++;
            }
        }
        System.out.print("Occurance of "+x +" is "+count);
    }
}
