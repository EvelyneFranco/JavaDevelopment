

public class ParentA {
	
		public String compareStrings(String word1, String Word2) {
			if(word1.equals(Word2)) {
				return "both are equals";
			}
			
			return null;
		}
		
		public void printString(String cadena) {
			
			if(cadena.length()>4) {
				char[] letras= cadena.toCharArray();
				
				for(int i=0; i<letras.length;i++) {
					System.out.println(letras[i]);
			    }
						
				
					
					
			}else {
				System.out.println(cadena);
			}
	
			
		}

}
