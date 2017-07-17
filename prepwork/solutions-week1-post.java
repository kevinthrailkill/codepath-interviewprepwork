//arrays


//add 1
public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    
	    int size;
	    int carry = 1;
	    int cur;
	    
	    for (int i = a.size() - 1; i >= 0; i--) {
	        
	        cur = a.get(i);
	        cur += carry;
	        carry = 0;
	        
	        if (cur == 10) {
	            cur = 0;
	            carry = 1;
	        }
	        
	        a.set(i, cur);
	        
	    }
	    
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    
	    if (carry == 1){
	        result.add(1);
	    }
	    
	    for (int num : a) {
	        if (num == 0 && result.size() == 0)
	            continue;
	        result.add(num);
	    }
	    
	    return result;
	    
	    
	    
	}
}

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





//string

//longest commin prefix

public class Solution {
	public String longestCommonPrefix(ArrayList<String> a) {
	    
	    if (a.size() == 0)
	        return "";
	        
	    StringBuffer prefix = new StringBuffer();
	    
	    int minLen = a.get(0).length();

        for(String str : a) {
            if (str.length() < minLen) {
                minLen = str.length();
            }
        }
	    
	    for (int i = 0; i < minLen; i++) {
	        
	        char c = a.get(0).charAt(i);
	        
	        for (int j = 1; j < a.size(); j++) {
	            
	            if (!a.get(j).startsWith(prefix.toString())){
	                prefix.setLength(prefix.length() - 1);
	                return prefix.toString();
	            }
	                
	        }
	        
	        prefix.append(c);
	        
	    }
	    
	    return prefix.toString();
	    
	    
	}
}


//reverse string

public class Solution {
	public String reverseWords(String a) {
	    
	    if(a.length() == 1){
	        return a;
	    }
	    
	    String[] words = a.split(" ");

	    StringBuffer b = new StringBuffer("");
	    
	    for(int i = words.length-1; i >= 0; i--){
	        b.append(words[i]);
	        b.append(" ");
	    }
	    
	    
	    b.setLength(b.length() - 1);
	    
	    return b.toString();
	    
	    
	}
}
