package algorithmDataStructure;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// # 100.   Stack  
		// # https://www.youtube.com/watch?v=KInG04mAjO0&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=100
		// ******************************************************
		  // stack = LIFO data structure. Last-In First-Out
		  //               stores objects into a sort of "vertical tower"
		  //               push() to add objects to the top
		  //               pop() to remove objects from the top
		  
		  // uses of stacks?
		  // 1. undo/redo features in text editors
		  // 2. moving back/forward through browser history
		  // 3. backtracking algorithms (maze, file directories)
		  // 4. calling functions (call stack)
		// *******************************************************
		System.out.println("# 100.   Stack: "  );
		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.empty());
		stack.push("Hello");
		System.out.println(stack);

		stack.pop();
		System.out.println(stack);
		
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("Borderlands");
		stack.push("FFVII");
		/*
		for (int i=0; i<1000000000; i++) {
			stack.push("Crazy");
		}
		*/
		String myFavGame = stack.pop();
		System.out.println(stack.peek());	
		System.out.println(stack.search("Fallout76"));
		System.out.println(stack.search("Skyrim")); // count starts from 1, 2, 3, ...
		System.out.println(stack);
		
		// # 101. Queue 
		// *****************************************************
		// Queue = FIFO data structure. First-In First-Out
		//		   A collection designed for holding elements prior to processing
		//		   Linear data structure
		
		//         enqueue = offer()
		//         dequeue = poll()
		
		// Where are queues useful?
		// 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
		// 2. Printer Queue (Print jobs should be completed in order)
		// 3. Used in LinkedLists, PriorityQueues, Breadth-first search
		// *****************************************************
		System.out.println("# 101.   Queue: "  );
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.contains("Harold"));
		
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue.peek());
		//queue.poll();
		//queue.poll();
		//queue.poll();
					
		System.out.println(queue);
		
		// # 102. priority queue 
	 	//Priority Queue = A FIFO data structure that serves elements
    	//                             with the highest priorities first 
    	//				  before elements with lower priority
    	    	//Strings in default order
		
		System.out.println("# 102.  Priority Queue: "  );
    	Queue<String> queue1 = new PriorityQueue<>();
    	
    	//Strings in reverse order
    	//Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
    	
    	queue1.offer("B");
    	queue1.offer("C");
    	queue1.offer("A");
    	queue1.offer("F");
    	queue1.offer("D");
    	
    	while(!queue1.isEmpty()) {
    		System.out.println(queue1.poll());
    	}
    	
    	// 103. LinkedList
    	 // *******************************************************
    	  // LinkedList =  Nodes are in 2 parts (data + address)
    	  //                        Nodes are in non-consecutive memory locations
    	  //                        Elements are linked using pointers
    	            
    	  //    advantages?
    	  //    1. Dynamic Data Structure (allocates needed memory while running)
    	  //    2. Insertion and Deletion of Nodes is easy. O(1) 
    	  //    3. No/Low memory waste
    	  
    	  //    disadvantages?
    	  //    1. Greater memory usage (additional pointer)
    	  //    2. No random access of elements (no index [i])
    	  //    3. Accessing/searching elements is more time consuming. O(n)
    	  
    	  //    uses?
    	  //    1. implement Stacks/Queues
    	  //    2. GPS navigation
    	  //    3. music playlist
    	  // *******************************************************
		System.out.println("# 103.  LinkedList: "  );
    	LinkedList<String> linkedList = new LinkedList<String>();

    	// LinkedList as a Stack
    	/*
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		linkedList.pop();
		System.out.println(linkedList); // [D, C, B, A]
    	 */
		
    	// LinkedList as a Queue
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		linkedList.poll();
		System.out.println(linkedList); // [B, C, D, F]

		linkedList.add(4, "E");
		linkedList.remove("E");
		System.out.println(linkedList.indexOf("F"));
				
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		linkedList.addFirst("0");
		linkedList.addLast("G");
		String first = linkedList.removeFirst();
		String last = linkedList.removeLast();
		
		System.out.println(linkedList);
    	
    	// 104. dynamic array 
		System.out.println("# 104. dynamic array  "  );
		DynamicArray dynamicArray = new DynamicArray(5);
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		
		//System.out.println(dynamicArray.get(0));
		//dynamicArray.insert(0, "X");
		//dynamicArray.delete("A");
		//System.out.println(dynamicArray.search("C"));
		
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
		
    	// 105. LinkedList vs ArrayList
		// arraylist is good most of the time, 
		// but linkedlist is better with big data + frequently insert/remove elements
		System.out.println("# 105. LinkedList vs ArrayList"  );

		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		long startTime;
		long endTime;
		long elapsedTime;
		
		for(int i = 0; i < 1000000; i++){
			linkedList1.add(i);
			arrayList.add(i);
		}
					
		// ****************LinkedList****************
		startTime = System.nanoTime();
		
		linkedList1.get(0);
		//linkedList.get(500000);
		//linkedList.get(999999);
		//linkedList.remove(0);
		//linkedList.remove(500000);
		//linkedList.remove(999999);
		
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		
		System.out.println("LinkedList:\t" + elapsedTime +" ns");
		
		// ****************ArrayList****************	
		
		startTime = System.nanoTime();
		
		arrayList.get(0);
		//arrayList.get(500000);
		//arrayList.get(999999);
		//arrayList.remove(0);
		//arrayList.remove(500000);
		//arrayList.remove(999999);
		
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		
		System.out.println("ArrayList:\t" + elapsedTime +" ns");
    	
		// 106. big O
		// 107. linear search
		// 108. binary search
		// 109. interplation search 
		// 110. bubble sort
		// 111. selection sort
		// 112. insertion sort
		// 113. recursion
		// 114. merge sort
		// 115. quick sort 
		// 116. hash table 
		// 117. graphs 
		// 118. adjacency matrix 
		// 119. adjacency lists
		// 120. depth first search 
		// 121. breadth first search
		// 122. tree
		// 123. binary search tree 
		// 124. tree traversal 
		
 	}
}
