import java.util.LinkedHashMap;

public class Linkeedhashmaps {
	
		


				public static void main(String[] args) {
					
				//LinkedHashMap<String,Integer> phonebook=new LinkedHashMap(4,075f,false); if we give fasle it will give insertion oirder
				LinkedHashMap<String,Integer> phonebook=new LinkedHashMap(4,075f,true);// if we put true here latest get will go last
				phonebook.put("tata",1111);
				phonebook.put("bata",2222);
				phonebook.put("nata",3333);
				phonebook.put("toyota",4444);
				phonebook.put("oops",5555);
				System.out.println(phonebook);
				System.out.println(phonebook.get("tata"));//{bata=2222, nata=3333, toyota=4444, oops=5555, tata=1111}
				
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
//{tata=1111, bata=2222, nata=3333, toyota=4444, oops=5555}
//{tata=1111, bata=2222, nata=3333, toyota=4444, oops=5555}
//{}

