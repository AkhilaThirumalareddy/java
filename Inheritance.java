import java.util.Scanner;
class Square{
int a;
Scanner sc=new Scanner(System.in);
void input(){
System.out.println("Enter value for a");
a=sc.nextInt();
}
void sqr(){
System.out.println("Square value of a is "+(a*a));
}
}
class Sum extends Square{
int b;
void accept(){
System.out.println("Enter value for b");
b=sc.nextInt();
}
void add(){
System.out.println("Sum of a,b is = "+(a+b));
}
}
class Inheritance{
public static void main(String args[]){
Sum x=new Sum();
x.input();
x.sqr();
x.accept();
x.add();
}
}
