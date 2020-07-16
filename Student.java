
class University{
void listOfColleges(){
System.out.println("1.CMR 2.TKR ");
}
void selectCollege(String clg_code){
System.out.println("College selected  is" +clg_code);
}
String seatAlloted(){
return "CMR";
}
String payFees(int amount){
System.out.println("Fees is "+amount);
return "not paid";
}

}
class Student{
public static void main(String args[]){
University jntu = new University();
jntu.listOfColleges();
jntu.selectCollege("CMRTC");
System.out.println("seat alloted is "+jntu.seatAlloted());
System.out.println("Fees is "+jntu.payFees(400000));
}
}
