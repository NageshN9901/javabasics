package java11;


import java.util.List;
import java.util.ArrayList;
public class genricmethods {

	
	static Character[] charArray= {'h','e','l','l','o'};// Here  Character is data type [] = array 
	//static String[] intArray= {1,2,3,4,5};
	static Integer[] intArray= {1,2,3,4,5};
	static Boolean[] boolArray = {true,false,true};
	
	public static <T> List<T> arrayToList(T[] array  , List<T>list) {// List is return type
		
		for(T o1bject :array) {
			list.add(o1bject);
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		List<Character>cherList=   arrayToList(charArray, new ArrayList<>());
		List<Boolean>boolList=    arrayToList(boolArray, new ArrayList<>());
		List<Integer>intList=      arrayToList(intArray, new ArrayList<>());
		//List<String>intList=arrayToList(intArray, new ArrayList<>());
		System.out.println(intList.get(0));// 1
		System.out.println((intArray));
		
		for (int element: intArray) {
            System.out.print(element);
	}
	
	}
}
