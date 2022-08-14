package Lmabaexpersiion;

public class Lmabaexperssion {
public static void main(String[] args) {
	

//	Userservice u=new Userservice();
//	System.out.println(u.getUserName());//hi this is noir,mal implention tyhere is not used any functional proagrming now
	//hi
// ontehr way 2
//	Userinterface obj=new Userinterface() {//Userinterface obj=new Userinterface() if we write this much it will own implemnts own 
//		
//		@Override
//		public String getUserName() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//	};
	// now lamba expeerrsion syntax with exmple
	// syntax for lamba  =(argumnets) -> {buissnessl;ogic} ;
	Userinterface o=()->{
		// here will write bisness logic
		return  "lanmaba expersion";
	};
	//when we have only one statment
//	Userinterface o=()->
//	// here will write bisness logic
//  "lanmaba expersion";
System.out.println(o.getUserName());//lanmaba expersion// we can call the thata absrt method 
System.out.println(o.getUserName());
//	
}
}// when we have only one statment we can use without curly braches also

//o
//lanmaba expersion