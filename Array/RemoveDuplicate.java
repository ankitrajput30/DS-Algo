import java.util.*;

public class RemoveDuplicate
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Elements");
        n = input.nextInt();

        int arr[] = new int[n];
        int tmp[] = new int[n];
        int j = 0;

        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
           if(arr[i]!=arr[i+1])
           {
                arr[j++] = arr[i];
           }
        }
        arr[j++] = arr[n-1];
        for(int i=0;i<j;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}