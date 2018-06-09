/*
Method references help to point to methods by their names. A method reference is described using "::" symbol. A method reference can be used to point the following types of methods −
- Static methods
- Instance methods
- Constructors using new operator (TreeSet::new)
*/
import java.util.List;
import java.util.ArrayList;

class MethodReference 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");

		List names = new ArrayList();

		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");

		names.forEach(System.out::println);
	}
}
//Here we have passed System.out::println method as a static method reference.