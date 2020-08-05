abstract class Restaurant{
abstract void takeOrder(String order);
abstract void takeOrder(String order1,String order2);
}
class breakfast extends Restaurant{
void takeOrder(String order1,String order2){
System.out.println("Order given is :"+order1+" and "+order2);
}
void takeOrder(String order){
System.out.println("Order given is :"+order);
}
}
class Abst{
public static void main(String []args){
Restaurant r;
r=new breakfast();
r.takeOrder("dosa");
}
}

