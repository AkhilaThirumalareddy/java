interface Animal{
void kind();
void move();
}
abstract class Mammals implements Animal{
void walk(){
System.out.println("Mammals walk");
}
}
abstract class Reptiles implements Animal{
void crawl(){
System.out.println("Reptiles crawl");
}
}
class bird extends Mammals{
public void kind(){
System.out.println("bird is a mammal");
}
public void move(){
System.out.println("birds move with wings");
}
}

class snake extends Reptiles{
public void kind(){
System.out.println("snake is a reptile");
}
public void move(){
System.out.println("snake moves on stomach/body");
}
}
class interfacedemo1{
public static void main(String []args){

Mammals m=new bird();
m.walk();
m.kind();
m.move();

Reptiles r =new snake();
r.crawl();
r.kind();
r.move();

}
}
