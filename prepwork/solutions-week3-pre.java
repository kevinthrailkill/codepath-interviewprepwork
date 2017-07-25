//searching


//search insert

public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
	    
	    
	    int start = 0;
	    int end = a.size() - 1;

        while( start <= end )
        {
            int mid = start + ( end - start ) / 2;
            if( a.get( mid ) == b )
            {
                return mid;
            }
            else if( a.get( start ) > b )
            {
                return start;
            }
            else if( a.get( end ) < b )
            {
                return end + 1;
            }
            else if( a.get( mid ) < b )
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
	}
	    
}


//sqrt

public class Solution {
	public int sqrt(int a) {
	    
        if (a == 0 || a == 1)
            return a;
 
        int start = 1;
        int end = a;
        int result = 0;
        while (start <= end)
        {
            int mid = (start + end) / 2;
 
            if (mid*mid == a)
                return mid;

            if (mid*mid < a)
            {
                start = mid + 1;
                result = mid;
            }
            else   
                end = mid - 1;
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





//binary trees

//pre order travesal

public class Solution {
	public ArrayList<Integer> preorderTraversal(TreeNode a) {
	    
	    
	    ArrayList<Integer> nodes = new ArrayList<Integer>();
	    
	    if (a == null) {
            return nodes ;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode root = a;

        stack.push(root);
         
        // traverse the tree
        while (stack.size() > 0) {
           
            // visit the top node
            root = stack.pop();
            nodes.add(root.val);
            
            
            if (root.right != null) {
               stack.push(root.right);
            }
            
            if (root.left != null) {
               stack.push(root.left);
            }
        }
        
        return nodes;
	    
	    
	    
	}
}


//identical binary tree

public class Solution {
	public int isSameTree(TreeNode a, TreeNode b) {
	    
	    if(a == null && b == null) {
	        return 1;
	    }
	    
	    if(a != null && b != null){
	        
	        
	        boolean areValsEqual = a.val == b.val;
	        int ret = 0;
	        if(areValsEqual){
	            ret = 1;
	        }
	        
	        
	        if(ret == 1 && isSameTree(a.left, b.left) == 1 && isSameTree(a.right, b.right) == 1){
	            return 1;
	        }else{
	            return 0;
	        }
	        

	        
	    }

	    return 0;

	}
}