import java.util.ArrayList;

public class runMethods {
	public static void main (String args[]) {
	 ClassWithMethods cm= new ClassWithMethods();
	 
	 //method 1
	 System.out.println("Method 1");
	 System.out.println(cm.compareWords("hola", "hola"));
	 System.out.println();
	 
	 //method 2
	 System.out.println("Method 2");
	 ArrayList<Integer> array= new ArrayList<Integer>();
	 array.add(3);
	 array.add(8);
	 array.add(5);
	 array.add(2);
	 cm.biggestNumber(array);
	 System.out.println();
	 
	 
	 //method 3
	 System.out.println("Method 3");
	 ArrayList<String> array2= new ArrayList<String>();
	 array2.add("futbool");
	 array2.add("basquetbol");
	 array2.add("handball");
	 array2.add("beisbol");
	 cm.ascDesc(array2);
	 System.out.println();
	 
	 //method 4
	 System.out.println("Method 4");
	 System.out.println(cm.returnStringSize("hola"));
	 System.out.println();
	 
	 
	 
	 //class 2 Method 1
	 
	 Class2WithMethods c2= new Class2WithMethods();
	 
	 System.out.println("Class 2 Method 1");
	 
	 c2.smallestNumber(array);
	 System.out.println();
	 
	 //class 2 Method 2
	 System.out.println("Class 2 Method 2");
	 
	  c2.mapkey();
 }
}
