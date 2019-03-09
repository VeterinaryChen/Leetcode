class Solution {
    public int[] sortArrayByParity(int[] A) {
        if(A.length==1){
            return A;
        }
        Arrays.sort(A);
        List<Integer> oddList = new LinkedList<>();
        List<Integer> evenList = new LinkedList<>();
        for(int i=0 ; i<A.length ; i++){
            if(A[i]%2==0 && A[i]!=1){
                evenList.add(A[i]);
            }else{
                oddList.add(A[i]);
            }
        }
        for (int i : oddList){
            evenList.add(i);
        }
        
        int[] result = new int[evenList.size()];
        for(int i=0 ; i<evenList.size() ; i++){
            result[i]=evenList.get(i);
        }
        return result;
    }

}
