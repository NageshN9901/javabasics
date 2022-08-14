package Hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
 import java.util.Collection;
public class hashmap1 {

	public static void main(String[] args) {
		
	HashMap<String,Integer> m=new HashMap();
	m.put("tata",1111);
	m.put("bata",2222);
	m.put("nata",3333);
	m.put("toyota",4444);
	m.put("oops",5555);
	System.out.println(m);//{bata=2222, nata=3333, oops=5555, toyota=4444, tata=1111}
    System.out.println(m.put("tata", 1234));// repalcing old value to new values
Set s=m.keySet();
System.out.println(s);//[bata, nata, oops, toyota, tata] only keys we can Retrives
Collection c=m.values();
System.out.println(c);//[2222, 3333, 5555, 4444, 1234] we can retirve only valuess
Set s1=m.entrySet();
System.out.println(s1);//[bata=2222, nata=3333, oops=5555, toyota=4444, tata=1234] we can retivre all entry pair of keys and avleuws
	
	 // to get all in line by line 
Iterator itr =s1.iterator();// one of cursers
while(itr.hasNext()) {// hasNest to check values presnt are not to make sure 
	Map.Entry m1=(Map.Entry)itr.next();// here Map.Entry means Entry is in Map so to use Entry we need use Map also 
	//Map.Entry =casting and it.next will check and retirve the data next();
	System.out.println(m1.getKey()+" "+m1.getValue());
	//bata 2222
//	nata 3333
//	oops 5555
//	toyota 4444
//	tata 1234
// to make data check and make some opertiions are cahnge data
	if(m1.getKey().equals("oops")) {
		m1.setValue(19999);
	}
	System.out.println(m);//{bata=2222, nata=3333, oops=19999, toyota=4444, tata=1234} here oops =19999 changed

}

	
	
	}	
}
