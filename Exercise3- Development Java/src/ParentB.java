import java.util.ArrayList;
import java.util.Collections;

public class ParentB extends ParentA implements Interface {
	
	

	public static void main(String args[]) {
		ParentA a= new ParentA();
		ParentB b= new ParentB();
		
		//method 1 from parent A
		System.out.println(a.compareStrings("igual", "igual"));
		
		//method 2 from parent A 
	    a.printString("hola");
	    a.printString("Evelyne");
	    
	    //method from interface
	    b.pintText();
	    System.out.println();
	    
	    //from extra class 
	    ArrayList<String> cadena = new ArrayList<String>();
	    cadena.add("Text");
		cadena.add("Baseball");
		cadena.add("Automation");
		cadena.add("Java");
		cadena.add("Laptop");
		cadena.add(null);
		
		
		//Use Lambda and .filter delete null
		b.deleteNull(cadena);
		//print desc and asc based on param 
		System.out.println("-----------desc----------");
		System.out.println();
		b.order("desc", cadena);
		System.out.println();
		System.out.println("------------asc-----------");
		b.order("asc", cadena);
		
		
	  //Distinct list 
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		b.missingNumber(numeros);
		
		
		
	}

	@Override
	public void pintText() {
		System.out.println("Hello interface");
		
	}
	
	public void order(String order, ArrayList<String> cadena) {
		   try {
			  
				if(order.equals("desc")) {
					 int last=cadena.size()-1;
					   cadena.remove(last);
					   Collections.sort(cadena);
					for(int i =cadena.size()-1;i>=0;i--) {
						System.out.println(cadena.get(i));
					}
					
				}else if (order.equals("asc")) {
					Collections.reverse(cadena);
					
					for(int i =cadena.size()-1;i>=0;i--) {
						System.out.println(cadena.get(i));
					}
				}
		   }catch(NullPointerException e) {
			   System.out.println(e);
		   }
			
		}

		
		public void deleteNull(ArrayList<String> cadena) {
			cadena.stream().filter(value->value!=null).forEach(System.out::println);
			
		}
		
		
		public void missingNumber(ArrayList<Integer> list) {
			list.stream().distinct().forEach(n->System.out.print(n+","));
			System.out.println();
			System.out.println("Missing nymbers are:");
			 int first=1;
			 for(int i=first;i<list.get(0);i++) {
				 System.out.println(i);
			 }
			 for(int i=1;i<list.size();i++) {
				 for (int j = 1+(list.get(i-1)); j < list.get(i); j++) {
			            System.out.println(j);
			        }
			 }
			 
		
		}
}
