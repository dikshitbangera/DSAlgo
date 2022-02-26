package LinearDS;

class QueueusingArray{
	
int rear_Q,front_Q;
int capacity;
int q[];
QueueusingArray(int size){
	capacity=size;
	q=new int[capacity];
}
void enqueue(int value) {
	if(rear_Q==capacity) {
		System.out.println("queue is already full, cannot add more elements");
	}
	else {
		//for(int i=0;i<rear_Q-1;i++) {
		q[rear_Q]=value;
		//}
		rear_Q++;
	}
}

void dequeue() {
	if(rear_Q==0) {
		System.out.println("The queue is empty, nothing to dequeue");
	}
	else {
		for(int i=0;i<rear_Q-1;i++) {
			q[i]=q[i+1];
		}
		rear_Q--;
	}
}

void display() {
	if(rear_Q==0) {
		System.out.println("The queue is empty, nothing to display");
	}
	else {
		for(int i=0;i<rear_Q;i++) {
			System.out.print(q[i]+" ");
		}
	}
	
	
}
}

public class QueueSolutions {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueusingArray q1=new QueueusingArray(5);
		q1.enqueue(4);
		q1.enqueue(3);
		q1.enqueue(7);
		q1.display();
		System.out.println();
		q1.dequeue();
		q1.dequeue();
		q1.display();
		
	}

}
