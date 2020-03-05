package CollectionsFramework.Task6;

import java.util.*;
public class App
{
	public static void main(String s[])
	{
		List<Object> a = new ArrayList<Object>();
		Scanner sc = new Scanner(System.in);
		a.add("Epam");
		a.add("Java");
		a.add(10);
		a.add(15.55);
		a.add("Programming");
		a.add(30);
		a.add("Collections");
		a.add("Framework");
		a.add(50);
		a.add(78);
		a.add("List");
		System.out.println("The List initially contains 10 objects. \nThey are : "+a);
		System.out.println("Choose 1-Add element in the list");
		System.out.println("Choose 2-Fetch the element from the list");
		System.out.println("Choose 3-Remove the element from the list");
		System.out.println("Choose 4-Print");
		int ch = sc.nextInt();
		Object obj;int index,p=1;
		do
		{
			switch(ch)
			{
				case 1 :
					System.out.println("Enter the object you want to insert and mention its desirable position");
					obj=sc.next();
					index = sc.nextInt();
					a.add(index,obj);
					System.out.println("Object "+obj+" added to list a at position "+index);
					break;
				case 2:
					System.out.println("Enter the index no. of the element u want to fetch");
					index = sc.nextInt();
					a.get(index);
					break;
				case 3:
 					System.out.println("Enter the element you want to remove");
					obj = sc.next();
					if(a.contains(obj))
					{
						a.remove(obj);
						System.out.println("Element removed");
					}
					else
						System.out.println("Element does not exist in the list");
					break;
				case 4 : 
					System.out.println("Printing the list "+a);
					break;
				default : System.out.println("Enter a valid choice");
			}System.out.println("Do u want to continue ? press 0 to stop and 1 to continue");
		}while(p != 0);
		
		sc.close();		
	}
}