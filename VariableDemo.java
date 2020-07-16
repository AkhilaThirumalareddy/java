class Student{
int id;
float percentage;
static String clg;
}
class Employee{
int empid;
float salary;
static String company;
}

class VariableDemo{
public static void main(String args[]){
Student Rahul= new Student();
Rahul.id =20;
Rahul.percentage=30.5f;
Student.clg= "cmr";
System.out.println("Student Details");
System.out.println("id="+Rahul.id);
System.out.println("percentage="+Rahul.percentage);
System.out.println("clg=" +Student.clg);

Employee shiva= new Employee();
shiva.empid=30;
shiva.salary=5000.0f;
shiva.company="Apple";
System.out.println("Employee Details");
System.out.println("id="+shiva.empid);
System.out.println("salary="+shiva.salary);
System.out.println("company=" +shiva.company);
}
}
