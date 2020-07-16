class Restaurant{
void menu(){
System.out.println("1.Idly 2.Dosa 3.Wada ");
}
void takeOrder(String Order1){
System.out.println("Order given is" +Order1);
}
String serveFood(){
return "Idly";
}
String payBill(int amount){
System.out.println("Amount given is "+amount);
return "paid";
}

}
class Customer{
public static void main(String args[]){
Restaurant ohris = new Restaurant();
ohris.menu();
ohris.takeOrder("Idly");
System.out.println("Food served is "+ohris.serveFood());
System.out.println("Bill "+ohris.payBill(234));
}
}

