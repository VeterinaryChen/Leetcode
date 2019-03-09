class Solution {
    public int[] sortedSquares(int[] A) {
    
       List<Integer> list = new LinkedList<>();
       int len = A.length;
       if(len==0){
           return A;
       } 
       for(int i=0 ; i<len ; i++){
           A[i] = A[i]*A[i];
       }
       Arrays.sort(A);
       return A;
    }
   
}
