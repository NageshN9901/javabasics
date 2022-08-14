package Hashmaps;

import java.util.HashMap;

public class hashmap2 {
	


			public static void main(String[] args) {
				
			HashMap<String,Integer> phonebook=new HashMap();
			phonebook.put("tata",1111);
			phonebook.put("bata",2222);
			phonebook.put("nata",3333);
			phonebook.put("toyota",4444);
			phonebook.put("oops",5555);
			System.out.println(phonebook);
			if(phonebook.containsKey("nata")) {
				phonebook.remove("nage");// here new nage replced in the place of nata
			}
			System.out.println(phonebook);
			phonebook.clear();
			System.out.println(phonebook);
			
	}
			//{bata=2222, nata=3333, oops=5555, toyota=4444, tata=1111}
			//{bata=2222, nata=3333, oops=5555, toyota=4444, tata=1111}
            //{}// for clear 

}
