import java.util.*;
public class featutres {
public static void main(String[] args) {
	
	
	// without genrics
	List names=new ArrayList();
	names.add("kelly");
	String name= (String) names.get(0);
	System.out.println("firstname"+name);
	names.add(7);// here we can add int also 
	System.out.println(names);
	System.out.println( names.get(1));
	
	
	// with Genrics
	
	List<String>names2=new ArrayList();
	names2.add("kellyja");
	String name2=names2.get(0);
	System.out.println("fisrtname "+name2);
	System.out.println(names2.get(0));
	//name2.add(7);// it will throw error becuse it int but genric type id String
}
}
