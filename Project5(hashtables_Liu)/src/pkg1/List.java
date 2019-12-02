package pkg1;

class List{
	private Node first;
	private Node last;
	
	public List() {
		first = null;
		last = null;
	}
	public void insertFirst(String name, double gdpPerCapita) {
		Node newLink = new Node(name,gdpPerCapita);
		if(isEmpty()) {
			last = newLink;
			newLink.nextNode = first;
			first = newLink;
		}
	}
	public void insertLast(String name, double gdpPerCapita){
		Node newLink = new Node(name, gdpPerCapita);
		if(isEmpty()) {
			first = newLink;
		}
		else {
			last.nextNode = newLink;
			last = newLink;
		}
			
	}
	public Node deleteFirst() {
		Node temp = first;
		if(first.nextNode == null)
			last = null;
		first = first.nextNode;
		return temp;
	}
	public void displayList() {
		System.out.print("this is the Link list");
		Node current = first;
		while(current != null) {
			current.printNode();
			current = current.nextNode;
		}
		System.out.println("");
	}
	public boolean isEmpty() { //checks if it is empty
		return first==null;
	}
	public boolean isFull() { //checks if it is full
		return false;
	}
}
