
import java.util.*;
class StackDemo{
public static void main(String args[]){
Stack<String> x= new Stack<String>();
x.push("G");
x.push("A");
x.push("R");
x.push("L");
x.push("A");
x.push("N");
x.push("D");
System.out.println(x);
x.pop();
x.pop();
System.out.println(x);
}
} 