import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String []st = s.split(" ");
        StringBuilder rt =  new StringBuilder();
        for(int i=0;i<st.length;i++){
            StringBuilder temp = new StringBuilder(st[i]);
            rt.append(temp.reverse());
            if(i!=st.length-1){
                rt.append(" ");
            }
        }
        return rt.toString();
    }
}
