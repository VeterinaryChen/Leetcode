class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        
        if x>0:
            x = list(str(x))
            result = ''
            x = x[::-1] 
            for i in x:
                result+=i
            if int(result)>2147483647:
                return 0
            else:
                return(int(result))
            
        else:
            x = -x
            x = list(str(x))
            result = ''
            x = x[::-1] 
            for i in x:
                result+=i
            if int(result)>2147483647:
                return 0;
            else:
                return(-(int(result)))