import java.util.ArrayList;

public class Exercice2 {
	String variableClassLevel;
	private String cadena;
	
	
	public String getCadena() {
		return cadena;
	}
	
	public void setCadena(String value) {
		cadena=value;
		
	}
	public Exercice2() {
		variableClassLevel="this is variable class level";
		
	}	
	
	public Exercice2 (String value) {
		variableClassLevel=value;
	}
	
	public void  methodOverloading(int array[]) {
		 int length=array.length;
		 
		 for (int i=0;i<length;i++) {
			 System.out.println(array[i]);
		 }
		
	}
	
	public void methodOverloading(int array[], String message) 
	{
			int length=array.length;
		 
		 for (int i=0;i<length;i++) {
			 System.out.println(message+" "+ i+" "+"is"+" "+ array[i]);
		 }
	}
	
	public void oddsEven(int array[]) {
		int result;
		ArrayList odds= new ArrayList<Integer>();
		ArrayList even= new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			result=array[i];
			if(result%2==0) {
				odds.add(array[i]);
			}else {
				even.add(array[i]);
			}
					
		}//for add
		
		System.out.println("Odds");
		
		for(int i=0;i<odds.size();i++) {
			System.out.print(odds.get(i)+",");
		}//for odds
		System.out.println();
		
		System.out.println("Evens");
		for(int i=0;i<even.size();i++) {
			System.out.print(even.get(i)+",");
		}// for even
	}
	
	public void patternPrint(int array[]) {
		int atras=4;
		int contador=0;
		String espacios=null;
		
		for(int i=0; i<array.length; i++) {
			StringBuilder builder=new StringBuilder();
			
			if(contador<5) {
				
				for(int j=0;j<contador;j++) {
				
					builder.append(" ");
					//System.out.print(builder.toString());
				}
				espacios=builder.toString();
				System.out.print(espacios);
				System.out.println(array[i]);
				
				contador++;
			}
			else if (atras>0 && contador==5) {
				builder= new StringBuilder();
				espacios= null;
				 for (int k=atras;k>0;k--) {
					 
					 builder.append(" ");
					
				 }
				 espacios=builder.toString();
				 System.out.print(espacios);
				 System.out.println(array[i]);
				 atras--;
				 
			}
			if(contador==5 && atras==0) {
				contador=0;
				atras=4;
			}
				
			
		}	//for
		
		
	} //metodo
	
	
		
				
		

	
	public static void main (String args[])
	{
		//1
		Exercice2 e2= new Exercice2();
		System.out.println(e2.variableClassLevel);
		
		//2
		Exercice2 eOverloading= new Exercice2("variable with contructor overloading");
		System.out.println(eOverloading.variableClassLevel);
		
		//3
		int array[]= {88,65,52,44,65,88};
		e2.methodOverloading(array);
		e2.methodOverloading(array, "Number in position");
		
		//4 validate set and get
		e2.setCadena("this is property private string");
		System.out.println(e2.getCadena());
		
		
		//5 odds evens
		int array20[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		e2.oddsEven(array20);
		
		System.out.println();
		
		//6 print pattern
		e2.patternPrint(array20);
	}
	

}
