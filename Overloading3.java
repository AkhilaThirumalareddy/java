class Airlines{
void flights(){
System.out.println("1.domestic 2.international");
}
void selectFlight(String Flight1){
System.out.println("Flight selected  is" +Flight1);
}
void selectFlight(String Flight1,String Flight2){
System.out.println("Flight selected  is" +Flight1+ " and "+Flight2);
}
void selectFlight(String Flight1,String Flight2,String Flight3){
System.out.println("Flight selected  is" +Flight1+ " and "+Flight2+ " and "+Flight3);
}

String confirmedFlight(){
return "domestic";
}
String payTicket(int amount){
System.out.println("Ticket price is "+amount);
return "paid";
}

}
class Overloading3{
public static void main(String args[]){
Airlines southwest = new Airlines();
southwest.flights();
southwest.selectFlight("Southwest","American","Delta");
System.out.println("confirmed flight is "+southwest.confirmedFlight());
System.out.println("TicketPrice is "+southwest.payTicket(234));
}
}
