interface vehicle{
void cost();
void milage();
}
abstract class Car implements vehicle{
void wipers(){
System.out.println("wipers to clean the window ");
}
}
abstract class Bike implements vehicle{
void stand(){
System.out.println("stand to support the Bike");
}
}
class Audi extends Car{
public void cost(){
System.out.println("cost of Audi is $50000");
}
public void milage(){
System.out.println("milage of Audi is 15 MPH");
}
}
class HarleyDavidson extends Bike{
public void cost(){
System.out.println("cost of Harley is $25000");
}
public void milage(){
System.out.println("milage of Harley is 25 MPH");
}
}
class InterfaceDemo{
public static void main(String args[]){
Car c=new Audi();
c.wipers();
c.cost();
c.milage();
Bike b=new HarleyDavidson();
b.stand();
b.cost();
b.milage();

}
}
