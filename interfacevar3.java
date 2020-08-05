interface Parent{
int age=54;
interface Child{
int age=22;
}
}
class AgeDetails implements Child{
void display(){
System.out.println("Parent Age is "+Parent.age);
System.out.println("Child Age is "+Child.age);
}
}
class interfacevar3{
public static void main(String []args){
AgeDetails a=new AgeDetails();
a.display();
}
}
