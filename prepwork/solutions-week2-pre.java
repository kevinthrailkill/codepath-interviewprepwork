//Hashing


//2 Sum

public class Solution {
	public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
	    
	    
	   
	    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    
	    int size = a.size();
	    
	    for(int i = size - 1; i >= 0; i--) {
	        
	        int val = a.get(i);
	        int diff = b - val;
	        
	        if(hashMap.containsKey(diff)) {
	            
	            int index = hashMap.get(diff);
	            
	            if(result.size() != 0){
	                if(index+1 < result.get(1)){
	                    result.set(0, i+1);
	                    result.set(1, index+1);
	                }else if(index+1 == result.get(1)){
	                    if(i+1 < result.get(0)){
	                        result.set(0, i+1);
	                    }
	                }
	                
	            }else{
	                result.add(i+1);
	                result.add(index+1);
	            }
	            
	        }
	        
	        
	        hashMap.put(val, i);

	    }
	   
	    return result;
	}
}


//diff possible

public class Solution {
	public int diffPossible(final List<Integer> a, int b) {
	    
	    HashMap<Integer, Integer> hashMap = new HashMap<>();
	    
	    for (int num : a) {
	        if (hashMap.containsKey(num)) {
	            return 1;
	        } else {
	            hashMap.put(num+b, num);
	            hashMap.put(num-b, num);
	        }
	    }
	    
	    return 0;
	}
}





//linked-lists

//remove duplicates

public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        
        
        if(A == null){
            return null;
            
        }
        
        ListNode head = A;
        
        ListNode cur = A;
        ListNode next = A.next;
        
        
        while( cur != null && next != null){
            
            if(cur.val != next.val){
                cur.next = next;
                cur = next;
            }
            
            next = next.next;
            
        }
        
        cur.next = null;
        
        
        
        return head;
        
        
    }
}


//list cycle

public class Solution {
	public ListNode detectCycle(ListNode A) {
	  
	    if(a == null || a.next == null){
	        return null;
	    }
	    
	    ListNode slow = a;
	    ListNode fast = a.next;
	    
	    while(fast != null){
	        
	        if(fast == slow){
	            return fast;
	        }
	        
	        slow = slow.next;
	        fast = fast.next.next;
	        
	        
	    }
	    
	    return null;
	    
	    
	}
}