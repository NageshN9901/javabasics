package queuewithLinkedlsit;
// why this progarm wrirten means every time custemr served it will removed qand return the name of 
import java.util.*;
public class Storequeue {

	public static void main(String[] args) {
		// why taken linkedlist meandn in  javaAPI 
		// which implents queu interface  class of linkedlist
		// here added 4 new custemrs to que
		LinkedList<Customerqueu> que=new LinkedList<Customerqueu>();
		que.add(new Customerqueu("nagesh"));
		que.add(new Customerqueu("gagan"));
		que.add(new Customerqueu("amji"));
		que.add(new Customerqueu("nagaraju"));
		System.out.println(que);
		serveCustemr(que);// why means we should pass that partcular refrnce id becuse theer only all data 
		// is thre so when we pass that regernce that mathod will get which collection i need to apply
		System.out.println(que);
	}
	// need method to serve a custemer at my store
	
	//here passing arumnet as object of Linkedlsit with its genric with refernce
	// i want make this method to behiave like when custemr served realy custemr should removed from queue
	static void serveCustemr(LinkedList<Customerqueu> inque) {
		Customerqueu c=inque.poll();// it returns and removes first custemr or head
		// now i need to call serve method to ensure  the serves done
		c.serve();// now need to call in mainmethod
	}
}
