import java.util.Scanner;

public class Main
{
    public static final int QUIT = 999;
    public static int[] counts = new int [6];
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int dep = getReady();
        while(dep != QUIT)
        {
            counts[dep] += 1;
            dep = getReady();
        }
        finishUp();
    }
    public static int getReady()
    {
        System.out.print("Enter number of dependents from 0 to 5 or " + QUIT + " to quit: ");
        int dep = input.nextInt();
        if(dep == QUIT)
        {
            return dep;
        }
        while(dep > counts.length - 1 || dep < 0)
        {
            System.out.println("Invalid input");
            System.out.print("Enter number of dependents from 0 to 5 or " + QUIT + " to quit: ");
            dep = input.nextInt();
        }
        return dep;
    }
    public static void finishUp()
    {
        System.out.println("Dependents Count:");
        for(int i = 0; i <= counts.length - 1; i++)
        {
            System.out.print(i + ": ");
            System.out.print(counts[i] + " \n");
            wait(1000);
        }
    }
    public static void wait(int ms) //DELAY METHOD
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException e)
        {
            //Thread.currentThread().interrupt();
        }
    }
}