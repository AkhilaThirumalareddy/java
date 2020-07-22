import java.util.Scanner;
class switchbreak{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Model's number:");
int modelnumber;
modelnumber=sc.nextInt();
switch(modelnumber){
case 1:
System.out.println("Runway");
break;
case 2:
System.out.println("Commercial ");
break;
case 3:
System.out.println("Magazine or Print");
break;
default :
System.out.println("Invalid Modelnumber");
}
}
}


