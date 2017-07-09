//Pretty Print
public class Solution {
    public int[][] prettyPrint(int A) {
        
        int n = 2*A-1;
        int[][] result = new int[n][n];
        int layers = A;
        
        if(A<=0) return result;
        
        
        for(int i = 0; i<layers; i++){
            if(i == layers-1){
                result[i][i] = A;
            }else{
                for(int j = i; j<n-1-i; j++){
                    result[i][j] = A;
                    result[j][n-1-i] = A;
                    result[n-1-i][n-1-j] = A;
                    result[n-1-j][i] = A;
                }
            }
            A--;
        }
        
        return result;
        
        
    }
}


//Kth Smallest Element in the Array
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        PriorityQueue<Integer> minque = new PriorityQueue();
        
        for(int i =0; i < A.length; i++){
            
            minque.add(A[i]);
            
            if(minque.size()>B){
                minque.poll();
            }
            
        }
        
        return minque.poll();
    }
}

//next greater
public class Solution {
    public int[] nextGreater(int[] A) {
        
        int length = A.length;
        
        int[] results = new int[length];
        int greater = -1;
        
        for (int i=0; i<length; i++)
        {
            greater = -1;
            
            for (int j = i+1; j<length; j++)
            {
                if (A[i] < A[j])
                {
                    greater = A[j];
                    break;
                }
            }
            results[i] = greater;
        }
        
        return results;
        
    }
}

//unique perm

public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        
        
        ArrayList<ArrayList<Integer>> permutations = new ArrayList<ArrayList<Integer>>();
        permutations.add(new ArrayList<Integer>());
        
        for (int i = 0; i < a.size(); i++) {
            HashSet<ArrayList<Integer>> cur = new HashSet<ArrayList<Integer>>();
            for (ArrayList<Integer> list : permutations) {
                for (int j = 0; j < list.size() + 1; j++) {
                    list.add(j, a.get(i));
                    ArrayList<Integer> perm = new ArrayList<Integer>(list);
                    list.remove(j);
                    cur.add(perm);
                }
            }
            permutations = new ArrayList<ArrayList<Integer>>(cur);
        }
        
        return permutations;
        
        
    }
}
