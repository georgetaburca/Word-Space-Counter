package spaceCounter;

public class spaceCounter {
	public static void main(String[] args) {
		
		String str = "Java is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies";
        
		int spaces = 0;
		for(int i = 0; i < str.length(); i++) {
         
			char ch = str.charAt(i);
			if(ch == ' ') {
				spaces++; 
			}
        	
		}
        	
        
        //Print out the results
       
        	System.out.println(spaces);
        }
	}

