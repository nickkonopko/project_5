package pkg1;

public class Node
{
	String name;
	double gdpPerCapita;
	Node nextNode;
	int result;
	
	public Node(String name, double gdpPerCapita) {
		this.name = name;
		this.gdpPerCapita = gdpPerCapita;
	}
	
	public void printNode() {
		System.out.printf("%-25s%,-20.2f\n", name, gdpPerCapita);
	}
	public String getname() {
		return name;
	}
	 public static int getIntval(String name) {

	        String result = "";

	        for (int i = 0; i < name.length(); i++) {

	            char ch = name.charAt(i);

	            if (Character.isLetter(ch)) {
	                char initialCharacter = Character.isUpperCase(ch) ? 'A' : 'a';
	                result = result.concat(String.valueOf((ch - initialCharacter + 1)));
	            }
	            else result = result + ch;
	        }

	        return Integer.parseInt(result);
	    }
}