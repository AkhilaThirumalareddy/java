
class Airlines{
void flights(){
System.out.println("1.domestic 2.international");
}
void selectFlight(String Flight1){
System.out.println("Flight selected  is" +Flight1);
}
String confirmedFlight(){
return "domestic";
}
String payTicket(int amount){
System.out.println("Ticket price is "+amount);
return "paid";
}

}
class Passenger{
public static void main(String args[]){
Airlines southwest = new Airlines();
southwest.flights();
southwest.selectFlight("domestic");
System.out.println("confirmed flight is "+southwest.confirmedFlight());
System.out.println("TicketPrice is "+southwest.payTicket(234));
}
}