class Car{
void cost(){
System.out.println("No cost");
}
void milage(){
System.out.println("No milage");
}
}
class Audi extends Car{
void cost(){
System.out.println("cost of audi is 50L");
}
void milage(){
System.out.println("milage of audi is 15km");
}
}
class BMW extends Car{
void cost(){
System.out.println("cost of BMW is 40L");
}
void milage(){
System.out.println("milage of BMW is 10km");
}
}
class MethodOverriding{
public static void main(String args[]){
Car x= new Car();
x.cost();
x.milage();
x=new Audi();
x.cost();
x.milage();
x=new BMW();
x.cost();
x.milage();
}
}


