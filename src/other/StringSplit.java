package other;

import java.util.Arrays;

public class StringSplit {
    public String[] stringSplit(String str, char deli){
        int len = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == deli) len++;
        }
        String [] strarr = new String[len + 1];
        String temp = "";
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == deli){
                strarr[count] = temp;
                temp = "";
                count++;
                continue;
            }
            temp += str.charAt(i);
        }
        strarr[len] = temp;
        return strarr;
    }
}