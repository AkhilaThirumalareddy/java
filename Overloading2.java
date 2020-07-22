class University{
void listOfColleges(){
System.out.println("1.CMR 2.TKR ");
}
void selectCollege(String clg_code1){
System.out.println("College selected  is " +clg_code1);
}
void selectCollege(String clg_code1, String clg_code2){
System.out.println("College selected  is " +clg_code1+ " and " +clg_code2);
}
String seatAlloted(){
return "CMR";
}
String payFees(int amount){
System.out.println("Fees is "+amount);
return "not paid";
}

}
class Overloading2{
public static void main(String args[]){
University jntu = new University();
jntu.listOfColleges();
jntu.selectCollege("CMRTC","TKRCE");
System.out.println("seat alloted is "+jntu.seatAlloted());
System.out.println("Fees is "+jntu.payFees(400000));
}
}

