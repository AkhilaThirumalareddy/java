abstract class Animal{
abstract void lifeSpan();
void breath(){
System.out.println("Can't survive without breathing");
}
}
class Cheetah extends Animal{
int lifespan= 20;
void lifeSpan(){
super.breath();
System.out.println("lifespan of Cheetah is "+lifespan+" years");
}
}
class Tiger extends Animal{
int lifespan=30;
void lifeSpan(){
super.breath();
System.out.println("lifespan of Tiger is "+lifespan+" years");
}
}
class MethodOver4{
public static void main(String []args){
Animal a;
a=new Cheetah();
a.lifeSpan();
a=new Tiger();
a.lifeSpan();
}
}
