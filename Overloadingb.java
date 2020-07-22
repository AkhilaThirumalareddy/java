import java.util.Scanner;
class Add{
void sum(int x, int y){
System.out.println("Integer sum ="+(x+y));
}
void sum(int x, int y, int z){
System.out.println("Integer sum ="+(x+y+z));
}
}
class Overloadingb{
public static void main(String args[]){
Add x = new Add();
Scanner sc =new Scanner(System.in);
System.out.println("Enter a,b,c values");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
x.sum(a,b,c);
}
}