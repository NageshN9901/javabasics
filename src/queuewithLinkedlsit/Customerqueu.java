package queuewithLinkedlsit;

public class Customerqueu {

	// varibles
	private boolean hasBeeaServed;
	private String name;
	
	
	// constructer
	public Customerqueu(String name) {
	
	hasBeeaServed =false;//defalut/ becsue intally its false becsue serves not started
	this.name = name;// becsue need custmeted sorting for every new custemr cames
	}
	
		//method
public void serve() {// when bill genretd automatically need to amke serveedc done thats why its true
	hasBeeaServed =true;// aftre servec done this mthoid will calls tahts why true
	System.out.println(name+"has been served");// every new custemer need new name
	
}
// to represent data in String
// every time new custemer craeted and serves done the object address it will convert into string 
// fomet and gives shows n desplay
@Override
public String toString() {
	return name;
}
	
	}

