import java.util.Scanner;

class Loops{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int x =sc.nextInt();
for(int i= 1;i<=10;i++){
System.out.println(x+"*"+i +" = "+ x*i);
}
}
}
