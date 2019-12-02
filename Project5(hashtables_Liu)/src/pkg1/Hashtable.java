package pkg1;

public class Hashtable
{
	private List[] hashArray;	//array of lists
	private int arraySize;
	int size = 311;

	public HashTable(int size) {
		arraySize = size;
		hashArray = new List[arraySize];
		for(int j=0; j<arraySize; j++)
			hashArray[j] = new List();
	}
	public void displayTable() {
		for(int j=0; j<arraySize; j++) {
			System.out.print(j + ". ");
			hashArray[j].displayList(); //displayList will be created
		}
	}
	public int hashFunc(int result) {	
		return result % arraySize;
	}
	public void insert(Node result) {
		int result = theLink.getresult();
		int hashVal = hashFunc(restult);
		hashArray[hashVal].insert(theLink);
	}
	public void delete(int result) {
		int hashVal = hashFunc(result);
		hashArray[hashVal].delete(result);
	}
	public Node find(int result) {
		int hashVal = hashFunc(result);
		Node theLink = hashArray[hashVal].find(result);
		return theLink;
	}
}