import java.util.*;
class VectorDemo{
public static void main(String args[]){
Vector<Integer> x= new Vector<Integer>();
x.add(24);
x.add(30);
x.add(44);
x.add(54);
x.add(78);
x.add(11);
x.add(9);
x.add(5 );
x.add(1 );
System.out.println(x);
Collections.sort(x);
System.out.println(x);
System.out.println(Collections.max(x));
System.out.println(Collections.min(x));
}
} 



