
public class Driver {
	public static void main(String args[])
	{
		NewHashTable<String, Integer> myTable = new NewHashTable<String, Integer>(2);
		myTable.put("one", 1);
		myTable.put("two", 2);
		myTable.put("three",  3);
		myTable.put("four", 4);
		System.out.println(myTable.get("one"));
		System.out.println(myTable.containsKey("three"));
		System.out.println(myTable);
	}

}