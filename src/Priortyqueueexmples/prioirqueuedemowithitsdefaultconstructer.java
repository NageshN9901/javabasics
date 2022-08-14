package Priortyqueueexmples;
import java.util.*;

import javax.lang.model.element.Element;
public class prioirqueuedemowithitsdefaultconstructer {
public static void main(String[] args) {
	PriorityQueue p=new PriorityQueue();
	System.out.println(p.peek());//null becsue ther is no data
	try {
		System.out.println(p.element());// runtimerror nosucheklemnt
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	// now how to send data to queue
  for(int i=0; i<=10; i++) {
	  p.offer(i);
  }
  System.out.println(p);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
  System.out.println(p.poll());//0
  System.out.println(p);//1, 3, 2, 7, 4, 5, 6, 10, 8, 9]

} 

}