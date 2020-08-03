import java.util.Scanner;
public class Onedigit 
{
    public static void main(String args[])
    {
        int num, n,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = sc.nextInt();
	sum=num;
while(sum>=10)
{
	num=sum;
        sum=0;
 	while(num> 0)
        {
		
            	n = num % 10;
            	sum = sum + n;
            	num = num / 10;
        }

	System.out.print("sum of digits: " +sum);
}

}
}