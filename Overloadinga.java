import java.util.Scanner;
class Add{
void sum(int x, float y){
System.out.println("Decimal sum ="+(x+y));
}
void sum(float x, int y){
System.out.println("Decimal sum ="+(x+y));
}
}
class Overloadinga{
public static void main(String args[]){
Add x = new Add();
Scanner sc =new Scanner(System.in);
System.out.println("Enter a,b values");
int a=sc.nextInt();
float b=sc.nextFloat();
x.sum(a,b);
}
}