abstract class Animal{
abstract void kind();
abstract void move();
void special(){
System.out.println("animals have special vibe");
}
}
class Mammal extends Animal{
String kind= "Bird";
String move="wings";
void kind(){
super.special();
System.out.println("kind of mammal: $"+kind);
}
void move(){
System.out.println("birds move with their: "+move);
}
}
class Reptiles extends Animal{
String kind="snake";
String move="crawl";

void kind(){
super.special();
System.out.println("kind of reptile :"+kind);
}
void move(){
System.out.println("reptiles: "+move);
}

}
class MethodOver3{
public static void main(String []args){
Animal a;
a=new Mammals();
a.kind();
a.move();
a=new Reptiles();
a.kind();
a.move();
}
}
