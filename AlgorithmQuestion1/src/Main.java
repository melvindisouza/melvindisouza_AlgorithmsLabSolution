import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static int numberOfTransaction(int num, int []arr)

    {

        int i = 0,count = 2,sum=0;
        if(arr[i]>=num)
        {

            count = 1;

        }
        if(i < arr.length-1)
        {
            sum = arr[i] + arr[i+1];
            ++i;
        }
        while(sum<num)
        {

            ++i;

            if(i >= arr.length)

            {

                return -1;

            }

            sum = sum + arr[i];

            ++count;

        }

        return count;

    }

    public static void main(String[] args) throws Exception
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of transaction array");
        int transaction = s.nextInt();

        int []worth = new int[transaction];
        System.out.println("Enter the values of array");
        for(int i = 0; i < transaction; i++)

        {

            worth[i] = s.nextInt();

        }
        System.out.println("Enter the total no of targets that needs to be achieved");
        int queries = s.nextInt();

        int [] target = new int[queries];
        ArrayList<Integer> last = new ArrayList<Integer>();


        for(int j = 0; j< queries; j++)
        {
            System.out.println("Enter the value of target ");
            target[j] = s.nextInt();
            int count = numberOfTransaction(target[j],worth);
            if(count>0){
            System.out.println("Target achieved after "+ count +" transactions");
            }
            else
            {
                System.out.println("Given target is not achieved ");
            }

        }

    }
}
