import java.util.ArrayList;
import java.util.Collections;

public class ClassWithMethods {
	
	//method 1.1 
	public String compareWords (String word1,String word2) {
		try{
			if (word1.equals(word2)) {
				return "words are equial";
			}
			
			
		}catch (NullPointerException e) {
			System.out.println(e);
			
			
		}
			
		
		return "no equals";
	}
	
	
	//method 2
	
	public boolean biggestNumber(ArrayList<Integer> array) {
		
		boolean encontrado = false;
		Collections.sort(array);
		int mayor=(int) array.get(array.size()-1);
		for(int i=0;i < array.size()-1;i++) {
			if(mayor<(int) array.get(i)) {
				encontrado=false;
			}
			else {
				encontrado=true;
			}
			
		}
		System.out.println(mayor);
		
		return encontrado;
		
	}
	
	//method 3
	public void ascDesc(ArrayList<String> array2) {
		Collections.sort(array2);
		
		System.out.println("Orden1:");
		
		for (String ordenado :array2) {
			System.out.println(ordenado);
		}
		System.out.println();
		System.out.println("Orden2:");
		System.out.println();
		
		for (int i=array2.size()-1;i>=0;i--) {
			System.out.println(array2.get(i));
		}
		
	}
	

	//method 4
	public int returnStringSize(String word) {
		char array[]= new char[word.length()];
		
		for(int i=0;i>array.length;i++) {
			array[i]=word.charAt(i);
		}
		
		int size=array.length;
		return size;
	}


	
	
}



