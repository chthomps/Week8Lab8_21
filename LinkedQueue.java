
// This class implements a queue using a linked list
// It requires the LinkedNode class to be defined

public class LinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;
	
	LinkedQueue() {
		front = rear = null;
		count = 0;
	}
	
	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear!=null)			
			rear.next = newNode; //insertion is at queue front. new node added at rear, pushing elements deeper into queue
		else 
			front = newNode; //if nothing is in the queue, front and rear are one and the same
		rear = newNode;
		count++;
	}
	
	int dequeue() {
		if (front==null) {
			return -1;
		}
		
		if (front!=rear) {
			int x = front.x; //pop off elements from the queue rear (FIFO)- int x is the total element count
			front = front.next;		
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count --;
			return x;
		}
	}
		//removeMiddle method (Exercise 2)
		
		public void removeMiddle(LinkedQueue inputQ) {
			
			//variable declaration
			int middle = (inputQ.size()/ 2);
			
			//generate a new queue that stores all elements of original minus the middle
			LinkedQueue minusMidQ =  new LinkedQueue();
			
			
			while (inputQ.count > 0) {
				int y = inputQ.dequeue();  //let "y" be the popped elements 
				if (inputQ.count == middle) {
					inputQ.dequeue();
				} else {
					minusMidQ.enqueue(y);
				}
			}
		
	}
	
	int first() {
		return front.x;
	}
	
	boolean isEmpty() {
		return count==0;
	}
	
	int size() {
		return count;
	}
}
