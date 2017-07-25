//arrays


//duplicate in array
public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    
	    Collections.sort(a);
	    
	    for(int i = 0; i < a.size()-1; i++){
	        
	        if(a.get(i).intValue() == a.get(i+1).intValue()){
	            return a.get(i).intValue();
	        }
	        
	    }
	    
	    return -1;
	    
	    
	    
	}
}

//wave array

public class Solution {
    public int[] wave(int[] A) {
        
        Arrays.sort(A);
        
        for(int i = 0; i < A.length-1; i+=2){
            
            int temp = A[i];
            A[i] = A[i+1];
            A[i+1] = temp;
            
            
        }
        
        
        return A;
              
    }
}





//string

//palindrome string 

public class Solution {
	public int isPalindrome(String a) {
	    if(a.length() == 0){
	        return 0;
	    }
	    
	    if(a.length() == 1) {
	        return 1;
	    }
	    
	    String spacesRemovedLowerCase = a.replaceAll("\\s+","").replaceAll("[^A-Za-z0-9]", "").toLowerCase();
	    
	    
	    for(int start = 0, end = spacesRemovedLowerCase.length()-1; start < end; start++, end--) {
	     //   System.out.print(spacesRemovedLowerCase.charAt(start));
	      //  System.out.print(spacesRemovedLowerCase.charAt(end));
	        if(spacesRemovedLowerCase.charAt(start) != spacesRemovedLowerCase.charAt(end)) {
	            return 0;
	        }
	    }
	    
	    return 1;
	}
}


//length of last word

public class Solution {
	public int lengthOfLastWord(final String a) {
	    
	    int lengthCurrentWord = 0;
	    int lengthPastWord = 0;
	    
	    for(int i = 0; i < a.length(); i++){
	        if(a.charAt(i) == ' '){
	            if(lengthCurrentWord > 0){
	                lengthPastWord = lengthCurrentWord;
	            }
	            lengthCurrentWord = 0;
	        }else{
	            lengthCurrentWord++;
	        }    
	    }
	    

	    if(lengthCurrentWord > 0){
	        return lengthCurrentWord;
	    }
	    
	    return lengthPastWord;
	    
	}
}