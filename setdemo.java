import java.util.*;
class setdemo{
	public static void main(String args[]){
		TreeSet<String> ts=new TreeSet<String>();
	
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		ts.add("e");
		ts.add("f");
		ts.add("g");
		ts.add("h");
		ts.add("K");
		ts.add("A");
		ts.add("B");
		ts.add("I");
		ts.add("j");
		ts.add("k");
		ts.add("L");
		ts.add("Z");
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.lower("K"));
		System.out.println(ts.floor("L"));
		System.out.println(ts.ceiling("I"));
		System.out.println(ts.higher("B"));
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
	
	
	
	}
}