package Lmabaexpersiion;

public class GreeitngasMain {
public static void main(String[] args) {
//	// BELOW CALLED ANNYOMUNS CALSS OF METHOD ONTEHR WAY OF IMPLENING
//	GreetingMessage gm=new GreetingMessage() {
//		
//		@Override
//		public void greet(String name) {
//			System.out.println("HELLO"  +" " +name);
//		}
//	};
	// now need to call method
//	gm.greet("nagesh n");//HELLO nagesh n
	// now we use lamba experrsion
	 GreetingMessage gm2=( String name)->{// here if we have only argument we can use like this (name)when we have more argu we sapetye by ,
		 System.out.println("HELLO"  +" " +name);
	 };
	 gm2.greet("hgftgg");//HELLO hgftgg
	 // onther interface implention
	 Greetprintmessage2interface  pm=()->{
		 System.out.println("this is ontehr inteface");
	 };
	 pm.printmessage();//this is ontehr inteface
}
}
