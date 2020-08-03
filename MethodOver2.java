class Animal{
void kind(){
System.out.println("Living being");
}
void move(){
System.out.println("Depends on kind of animal");
}
}
class Reptile extends Animal{
void kind(){
System.out.println("snakes are reptiles");
}
void move(){
System.out.println("reptiles crawl");
}
}
class Mammal extends Animal{
void kind(){
System.out.println("bird is a mammal");
}
void move(){
System.out.println("Mammals move with uniquely ex:feathers");
}
}
class MethodOver2{
public static void main(String args[]){
Animal x= new Animal();
x.kind();
x.move();
x=new Reptile();
x.kind();
x.move();
x=new Mammal();
x.kind();
x.move();
}
}
