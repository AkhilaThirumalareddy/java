import java.util.Scanner;
class ifelseif{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String classtype="unknown";
int choice=0;
System.out.println("Enter the type of class you would like to attend: ");
System.out.println("1. Java Coding ");
System.out.println("2. Java Theory ");
System.out.println("3. Both ");
choice = sc.nextInt();
if (choice==1){
System.out.println("Welcome to Java Coding");
}
else if (choice==2){
System.out.println("Welcome to Java Theory");
}
else if (choice==3){
System.out.println("Welcome to Both java Coding and Theory class");
}
else{
System.out.println("Invalid Choice");
}
}
}


