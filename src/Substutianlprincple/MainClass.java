package Substutianlprincple;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
public static void main(String[] args) {
	Building building=new Building();// object created 
	Office office=new Office();// object created 
	// this below shows substunal princple
build(building);// method passing the object ref of Building as parent
build(office);//method   passing onther its child object of class


	/// here Building is super object so it can accpet bulinf and office both 
List<Building>buildingss=new ArrayList<Building>();
buildingss.add(new Building());
buildingss.add(new Office());
printBuilding(buildingss);// called method with aruguments  so it will call only that partcualr 
//argument type method name
	//1;building
//2;it office
	


List<Office>OFFICES=new ArrayList<Office>();
OFFICES.add(new Office());
//OFFICES.add(new Building());// we can to add it schild classss
OFFICES.add(new Office());
printBuilding(OFFICES);
}
// BY PASSING CHILD OBJHECT CLASS WE CAN W
//static void build(Office  constrction)
//{
//	System.out.println("constrcting a naya"+constrction.toString());
//}// constrcting a nayait office
static void build(Building constrction)// it will call its 2 methods 
{
	System.out.println("constrcting a naya"+constrction.toString());
}//constrcting a nayabuilding
//constrcting a nayait office


static void printBuilding(List< ? extends Building> cons) {
	for (int i = 0; i < cons.size(); i++) {
		System.out.println(i+1+";"+cons.get(i).toString());
		
	}
}
}
