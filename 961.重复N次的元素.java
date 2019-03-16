class Solution {
    public int repeatedNTimes(int[] A) {
        int N = A.length / 2;
        Map map = new HashMap();
        for (int i=0 ;i<A.length ; i++){
            int temp = A[i];
            if(map.get(temp)==null){
                map.put(temp,1);
            }else{
                map.put(temp,(int)map.get(temp)+1);
            }
        }
        Iterator iterator = map.keySet().iterator();
        int res = 0;
        while(iterator.hasNext()){
            int key = (int)iterator.next();
            int value = (int)map.get(key);
            if (value == N){
                res = key;
                break;
            }
        }
        return res;
    }
}
