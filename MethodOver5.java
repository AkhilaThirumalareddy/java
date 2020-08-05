class Mobile{
void cost(){
System.out.println(" No Cost");
}
void model(){
System.out.println("No model");
}
}
class Iphone extends Mobile{
int cost=1000;
String model="Iphone11";
void cost(){
System.out.println("Cost- Iphone : $"+cost);
}
void model(){
System.out.println("Model:  "+model);
}
}
class Blackberry extends Mobile{
int cost=800;
String model="B10";
void cost(){
System.out.println("Cost -Blackberry : $"+cost);
}
void model(){
System.out.println("Model-Blackberry : "+model);
}
}
class MethodOver5{
public static void main(String []args){
Mobile m;
m=new Iphone();
m.cost();
m.model();
m=new Blackberry();
m.cost();
m.model();
}
}