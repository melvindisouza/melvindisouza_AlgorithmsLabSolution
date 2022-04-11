import java.util.Arrays;
import java.util.Scanner;



public class CurrencyCount
{
    public static void reverse(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
    public static void countCurrency(int amount,int notes [],int denominationSize)
    {

        Arrays.sort(notes);
        reverse(notes);
        int noteCounter[]= new int[denominationSize];
        // count notes using Greedy approach
        for (int i = 0; i < denominationSize; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        System.out.println("Your payment approach in order to give min no of notes will be ");
        for (int i = 0; i < denominationSize; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of currency denominations ");
        int denominationSize = s.nextInt();
        int []currencyDenomination = new int[denominationSize];
        System.out.println("Enter the currency denominations value");
        for(int i = 0; i < denominationSize; i++)
        {
            currencyDenomination[i] = s.nextInt();
        }
        System.out.println("Enter the amount you want to pay");
        int amount= s.nextInt();
        countCurrency(amount,currencyDenomination,denominationSize);
    }
}
