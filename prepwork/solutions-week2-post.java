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

//add two numbers

public ListNode addTwoNumbers(ListNode a, ListNode b) {
	    
	    ListNode head = null;
	    ListNode sumNode = null;
	    ListNode current;
	    
	    int carry = 0;
	    int sum = 0;
	    
	    
	    while(a != null || b != null || carry != 0){
	        
	        current = new ListNode(0);
	        
	        //get value from previous addtion
	        sum = carry;
	        
	        if(head == null){
	            head = current;
	        }
	        
	        if(sumNode != null){
	            sumNode.next = current;
	        }
	        
	        if(a != null){
	            sum += a.val;
	            a = a.next;
	        }
	        
	        if(b != null){
	            sum += b.val;
	            b = b.next;
	        }
	        
	        
	        //get ones place if over 10
	        current.val = sum%10;
	        sum = sum / 10;
	        carry = sum;
	        
	        sumNode = current;
	        
	    }
	    
	    return head;

	}


//merge two sorted list

public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        
        
        
        if (A == null){
	        return B;
        }
	        
	    if (B == null){
	        return A;
	    }
        
        
        ListNode head;
	    ListNode cur = new ListNode(0);
	    head = cur;
        

        while(A != null && B != null){
            
            if(A.val <= B.val){
                cur.next = A;
                A = A.next;
            }else{
                cur.next = B;
                B = B.next;
            }
            
            cur = cur.next;
            
        }
        if(A == null){
            cur.next = B;
        }
            
        if(B == null){
            cur.next = A;
        }
        
        head = head.next;
        
        return head;
        
        
    }
}