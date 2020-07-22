import java.util.Scanner;
class Add{
void sum(int x, int y){
System.out.println("Integer sum ="+(x+y));
}
void sum(float x,float y){
System.out.println("Decimal sum ="+(x+y));
}
}
class Overloading{
public static void main(String args[]){
Add x = new Add();
Scanner sc =new Scanner(System.in);
System.out.println("Enter a,b values");
float a=sc.nextFloat();
float b=sc.nextFloat();
x.sum(a,b);
}
}

