public class LinkedList<T> {
	public Node head;
	public class Node{
		public Node next;
		// значение узла
		public T value;
	}

	public void addFirst(T item){
		Node node = new Node();
		node.value = item;
		if (head != null){
			node.next = head;
		}
		head = node;
	}
	public void deleteFirst(){
		if (head != null){
			head = head.next;
		}
	}
	public Node search(T value){
		Node node = head;
		while(node != null){
			if(node.value.equals(value)){
				return node;
			}
			node = node.next;
		}
		return null;
	}
	public void sort(Comparator<T> comparator){
		Node node = head;
		while(node != null){
			Node minValueNode = node;
			Node nodeForeSecondCycle = node = node.next;
			while(nodeForeSecondCycle != null){
				if(comparator.compare(minValueNode.value, nodeForeSecondCycle.value)>0){
					minValueNode = nodeForeSecondCycle;
				}
				nodeForeSecondCycl = nodeForeSecondCycl.next;
			}
			if(minValueNode != node){
			T buff = node.value;
			node.value = minValueNode.value;
			minValueNode.value = buff;
			}
			node = node.next;
	 	}
	}
	public String toString() {
		StringBuilder stringbuilder = new StringBuilder();
		Node node = head;
		while(node != null){
			stringbuilder.append(node.value);
			stringbuilder.append('\n');
			node = node.next;
		}
		return stringbuilder.toString();
	}
	public void addLast(T item){
		Node node = new Node();
		node.value = item;
		if (head == null){
			 head = node;
		}else{
			Node lastNode = head;	
			while(lastNode.next != null){
				lastNode = lastNode.next;
			}
			lastNode.next = node;
		}
	}
	public void removeLast(){
		if (head == null)
			 return;
			Node node = head;	
			while(node.next != null){
				if(node.next.next==null){
					node.next = null;
					return;
				}
				node = node.next;
			}
		head=null;
	}
	public void reverse(){
		Node node = head;
		Node temp;
		Node prevNode = null;

		while (node != null)
		{
				temp = node.Next;
				node.Next = prevNode;
				prevNode = node;
				node = temp;
		}
		head = prevNode;
	}
}