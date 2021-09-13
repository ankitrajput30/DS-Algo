import java.util.*;

public class FreqInSortedArray
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
        int freq = 1;
        int i = 1;
        while(i < n)
        {
            while(i < n && arr[i] == arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.print("\nThe Frequency In Sorted Array is : ");
            System.out.print(arr[i-1] + " " + freq);
            i++;
            freq = 1;
        }
        if(n == 1 || arr[n-1] != arr[n-2])
        {
            System.out.print(arr[n-1] + " " + 1);
        }
    }
}
