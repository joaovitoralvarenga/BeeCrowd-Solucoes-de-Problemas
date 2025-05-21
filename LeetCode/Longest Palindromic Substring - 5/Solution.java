import java.util.*;

class Solution {
       public String longestPalindrome(String s) {
        String resp = "";
        int respLen = 0;

        for(int i = 0;i< s.length();i++) {
            int dir = i, esq = i;

            while(esq >=0 && dir < s.length() && s.charAt(esq) == s.charAt(dir)) {
                if(dir - esq + 1 > respLen) {
                    resp = s.substring(esq,dir  + 1);
                    respLen = dir - esq + 1;

                }

                esq--;
                dir++;
            }

            esq = i;
            dir = i+1;

            while(esq >=0 && dir < s.length() && s.charAt(esq) == s.charAt(dir)) {
                if(dir - esq + 1 > respLen) {
                    resp = s.substring(esq,dir + 1);
                    respLen = dir - esq + 1;
                }

                esq--;
                dir++;
            }



        }

        return resp;

    }

}
