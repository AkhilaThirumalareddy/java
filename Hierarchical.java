import java.util.Scanner;
class Animal{
String a,b;
Scanner sc =new Scanner(System.in);
void types(){
System.out.println("different types of animals");
a=sc.next();
b=sc.next();
}
}
class Dog extends Animal{
String c,d;
void animaldog(){
System.out.println("Dogs are:");
c=sc.next();
d=sc.next();
System.out.println("Dogs are also pet animals like "+a+ " which are "+c+ " and " +d);
}
}
class Cat extends Animal{
String e;
void animalcat(){
System.out.println("Cats unlike dogs");
e=sc.next();
System.out.println("People pets cats like which usually " +e);
}
}
 class Hierarchical{
public static void main(String args[]){
Dog Bruno=new Dog();
Cat Lisa=new Cat();
Bruno.types();
Bruno.animaldog();
Lisa.animalcat();
}
}