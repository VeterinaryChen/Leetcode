class Solution {
     public int numJewelsInStones(String J, String S) {
        HashMap hashMap = new HashMap();
        for (int i=0 ; i<S.length() ; i++){
            char temp = S.charAt(i);
            if (hashMap.get(temp)==null){
                hashMap.put(temp,1);
            }else{
                hashMap.put(temp,(int)hashMap.get(temp)+1);
            }
        }
        int res = 0;
        for (int j=0 ; j<J.length() ; j++){
            if (hashMap.get(J.charAt(j))!=null){
                res += (int)hashMap.get(J.charAt(j));
            }
        }
        return res;
    }
}
