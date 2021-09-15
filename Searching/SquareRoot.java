import java.util.*;

public class SquareRoot
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Element to find Square Root :");
        int x = input.nextInt();
        int low = 1;
        int high = x;
        int ans = -1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            int msq = mid * mid;
            if(msq == x)
            {
                System.out.println("" + mid);
            }
            else if(msq > x)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
                ans = mid;
            }
        }
        System.out.println("The Square Root of tne Number is : " + ans);
    }
}
