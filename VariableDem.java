class Patient{
int id;
float bill;
static String hospital;
}
class Dentist{
int dentistid;
float salary;
static String hospital;
}

class VariableDem{
public static void main(String args[]){
Patient Siya= new Patient();
Siya.id =14;
Siya.bill=300.5f;
Patient.hospital= "BCBS";
System.out.println("Patient Details");
System.out.println("id="+Siya.id);
System.out.println("bill="+Siya.bill);
System.out.println("hospital=" +Patient.hospital);

Dentist Riya= new Dentist();
Riya.dentistid=30;
Riya.salary=500000.0f;
Riya.hospital="BCBS";
System.out.println("Dentist Details");
System.out.println("dentistid="+Riya.dentistid);
System.out.println("salary="+Riya.salary);
System.out.println("hospital=" +Riya.hospital);
}
}
