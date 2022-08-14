package usingmethodreffrencse;

public class REFMain {
public static void main(String[] args) {
	square s=new square(4);// we are passing side length becuise its construvcter we mention constreucvter
// first way
//Shapes sh=(square a)->{
//	return s.calculteArea();// we have used s whivh belongs squre class why means that method in that class only
//// or return a.calculteArea(;)when we passing s.calculatearea s means which class or inreface hat method is presnt 
//};
//System.out.println("area"+" "+sh.getArea(s));///area 16
//}

// we can do onethre way shorter way tis is ccALLED METHOD REFFERNCE
Shapes sh=square::calculteArea;
System.out.println("area"+" "+sh.getArea(s));//area 16
}
}
