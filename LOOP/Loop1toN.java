import java.util.Scanner;
public class Loop1toN{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int i = 1;
        while(i <= n){
            System.out.println(i++);
        }
       
        }
    }
 