class Restaurant{
void menu(){
System.out.println("1.Idly 2.Dosa 3.Wada ");
}
void takeOrder(String Order1){
System.out.println("Order given is " +Order1);
}
void takeOrder(String Order1, String Order2){
System.out.println("Order given is " +Order1+ " and " +Order2);
}
void takeOrder(String Order1,String Order2,String Order3){
System.out.println("Order given is " +Order1+ " and " +Order2+ " and " +Order3);
}

String serveFood(){
return "Idly";
}
String payBill(int amount){
System.out.println("Amount given is "+amount);
return "paid";
}

}
class Overloading1{
public static void main(String args[]){
Restaurant ohris = new Restaurant();
ohris.menu();
ohris.takeOrder("Idly","Dosa","Wada");
System.out.println("Food served is "+ohris.serveFood());
System.out.println("Bill "+ohris.payBill(234));
}
}
