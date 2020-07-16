class Customer{
int id;
float price;
String brand;
}
class Owner{
int phone;
float profit;
String ownername;
}

class Test3{
public static void main(String args[]){
Customer Siya= new Customer();
Siya.id =14;
Siya.price=30.5f;
Siya.brand= "Mac";
System.out.println("Customer Details");
System.out.println("id="+Siya.id);
System.out.println("bill="+Siya.price);
System.out.println("brand=" +Siya.brand);

Owner Riya= new Owner();
Riya.phone=78685;
Riya.profit=500000.0f;
Riya.ownername="RiyaSehgal";
System.out.println("Owner Details");
System.out.println("phone="+Riya.phone);
System.out.println("profit="+Riya.profit);
System.out.println("ownername=" +Riya.ownername);
}
}


