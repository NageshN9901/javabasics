import java.util.LinkedList;

public class LinkedLis {// should not be the same name in java
	
	 public static void main(String[] args) {
	 
	    // Create a LinkedList
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    // Add elements to LinkedList
	    linkedlist.add("Cobol");
	    linkedlist.add("JCL");
	    linkedlist.add("C++");
	    linkedlist.add("C#");
	    linkedlist.add("Java");
	  linkedlist.removeFirst();
	  System.out.println(linkedlist+"removedfirst");
	  linkedlist.removeLast();
	  System.out.println(linkedlist+"removedlastd");
	  
	    // Displaying Elements before replace
	    System.out.println("LinkedList Elements:");
	    for(String str: linkedlist){
	       System.out.println(str);
	    }
	 
	    // Removing 3rd element
	    Object e1 = linkedlist.remove(0);
	    System.out.println("\nElement "+ e1+ " removed from the list\n");
	    Object e2 = linkedlist.remove(1);
	    System.out.println(e2 +" removed");
	    
System.out.println(linkedlist);
	    // LinkedList elements after remove
	    System.out.println("After removal:");
	    for(String str2: linkedlist){
	       System.out.println(str2);
	    }
	 }
	}

