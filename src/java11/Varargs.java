package java11;

public class Varargs {

	public static void main(String[] args) {
		String item1="Apples";
		String item2="Orange";
		String item3="PEARS";// CREATED 3 VRIBLES WITH DATA
		String shop="one12";
		String [] shopping = {"Bread","Milkj","Eggs","Bananas"};// created shooping array with string datatype
		printShoopingList(item1,item2,item3);// creted method with 3 paramaters
		printShoopingList(shopping);// soma method overloaded with 1 para here shopping also refernce 
		printShoopingList(shop);
	}
	// overloaded method with 2 para
//	private static void printShoopingList(String S1, String S2) {
//		System.out.println("SHOPPINGLIST11");
//		System.out.println("1"+S1);
//		System.out.println("2"+S2);
//	}
//	
//	// overloaded method with 3 para
//	private static void printShoopingList(String i1, String i2, String i3) {
//		System.out.println("SHOPPINGLIST1");
//		System.out.println("1"+i1);
//		System.out.println("2"+i2);
//		System.out.println("3"+i3);
//		System.out.println();
//	}
//
//	private static void printShoopingList(String[] collectioloietms) {
//		System.out.println("SHOPPINGLIST2");
//		for (int i = 0; i < collectioloietms.length; i++) {
//			System.out.println(i+1+":"+collectioloietms[i]);
//		}
//		System.out.println();
//	SHOPPINGLIST2
//	1:Apples
//	2:Orange
//	3:PEARS
//
//	SHOPPINGLIST2
//	1:Bread
//	2:Milkj
//	3:Eggs
//	4:Bananas

//	
//}
	// insted of all methods we can use varargs here  same out put with varargs
	private static void printShoopingList(String ... collectioref) {
		System.out.println("SHOPPINGLIST2");
		System.out.println();
		for (int i = 0; i < collectioref.length; i++) {
			
			System.out.println(i+1+":"+collectioref[i]);
			
		}
//		System.out.println();
//		SHOPPINGLIST2
//		1:Apples
//		2:Orange
//		3:PEARS
//
//		SHOPPINGLIST2
//		1:Bread
//		2:Milkj
//		3:Eggs
//		4:Bananas

}
	
}
