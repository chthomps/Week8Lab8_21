
public class DriverExercise2 {

		static int[] newArray = { 1, 7, 3, 4, 9, 2 };
		

		public static void main(String[] args) {
			
			//instantiate ArrayQueue and LinkedQueue objects
			ArrayQ array = new ArrayQ();
			LinkedQueue queue = new LinkedQueue();
			
			
			//the ArrayQ
			
			for (int index= 0; index< newArray.length; index++) { //add values to the ArrayQueue
				array.enqueue(newArray[index]);
			}
			while (!(array.isEmpty())) {  //pop off values, printing each
				System.out.println(array.dequeue());
			}
			
			
			System.out.println();
			
			
			//the LinkedQueue
		
			for (int index= 0; index< newArray.length; index++) { //add values to LinkedQueue front (based on how LinkedQueue method is written)
				queue.enqueue(newArray[index]);
			}
			
			queue.removeMiddle(queue);
			
			
			for (int index= newArray.length-1; index >=0; index--) { //pop off values from rear (per LinkedQueue method)
																	 //thus starting w/greatest index (FIFO), printing each
				System.out.println(queue.dequeue());
			}
			
				
	}

	


	

}
