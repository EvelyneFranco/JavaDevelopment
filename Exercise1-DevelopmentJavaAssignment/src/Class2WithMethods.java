import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Class2WithMethods {
	
	public void smallestNumber(ArrayList<Integer> array) {
		Collections.sort(array);
		int menor=(int) array.get(0);
		
		System.out.println(menor);
		
	}

	
	public void mapkey() {
		HashMap <Integer , String> map= new HashMap<>();
		
		map.put(1, "Lunes");
		map.put(2,"Martes");
		map.put(3,"Miercoles");
		map.put(4,"Jueves");
		map.put(2,"Viernes");
		
		for (int i=1; i<=map.size();i++) {
		
			System.out.println("value in key "+i+" is: "+map.get(i));
		}
		System.out.println("value in key "+map.size()+" is: "+map.get(map.size()));
	}

	

}
