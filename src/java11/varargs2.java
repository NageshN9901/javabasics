package java11;

public class varargs2 {
//static void fun1(int ...a1)// varargs ...a1 is alsisa
//	{
//	System.out.println("The Number of the arguments metioned: " + a1.length);
//	for (int i1: a1)// foe each loop i1 is reference 
//	System.out.print(i1 + " ");
//	System.out.println();
//	}
//	public static void main(String args[])
//	{
//	fun1(1000);
//	fun1(11, 12, 13, 14);
//	fun1(2,67);
//	fun1();
//	}
	//o/p
//	The Number of the arguments metioned: 1
//	1000 
//	The Number of the arguments metioned: 4
//	11 12 13 14 
//	The Number of the arguments metioned: 2
//	2 67 
//	The Number of the arguments metioned: 0
/// >>>>>> 2 2nsd problm
//	static void fun21(String str2, int ...a2)
//	{
//	System.out.println("String: " + str2);
//	System.out.println("Number of arguments is: "+ a2.length);
//	for (int i2: a2)
//	System.out.print(i2 + " ");
//	System.out.println();
//	}
//	public static void main(String args[])
//	{
//	fun21("nnnCEOofProfitLoops", 1000, 2000);
//	fun21("ProfitLoops", 21, 22, 23, 24, 25);
//	fun21("fortheWorld");
//	fun21("jkjk", 5);
//	}
	
		static void display(String... values1){
		System.out.println("Here Now the display method is invoked ");
		for(String s1:values1){
		System.out.println(s1);
		}
		}
		public static void main(String args[]){
		 display();
		display("Howdyhello");
		display("my","name","is","varargs-pavan");
		display("Pavan Kumar Sake is the future billionaire. Soon You will see.. :-)");
		}
		}


	


