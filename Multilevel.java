
import java.util.Scanner;
class Animal{
String a, b;
Scanner sc=new Scanner(System.in);
void eat(){
System.out.println("Dogs are animals comes in different breeds");
a=sc.next();
b=sc.next();
}
}

class Dog extends Animal{
String c,d;
void bark(){
System.out.println("different types of barking");
c=sc.next();
d=sc.next();
}
void add(){
System.out.println(c+"is often when dogs are scared for example by a "+a);
System.out.println(d+"is often noticed when dogs are bored for example by a "+b);
}
}

class BabyDog extends Dog{
void weep(){
System.out.println("baby dogs often weep because of the anxiety");
}
}
class Multilevel{
public static void main(String args[]){
BabyDog Bruno=new BabyDog();
Bruno.eat();
Bruno.bark();
Bruno.add();
Bruno.weep();
}
}