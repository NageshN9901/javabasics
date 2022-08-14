package Priortyqueueexmples;
// here we will make custmezed sorting using 3rd construter of priptrtqueue
import java.util.PriorityQueue;

public class prioirtyqueue3thcosntreuet {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue(15,new MyCompareter());
		p.offer("a");
		p.offer("b");
		p.offer("c");
		p.offer("d");
		p.offer("z");
		System.out.println(p);
	}
}//[z, d, b, a, c] [z, d, b, a, c]
