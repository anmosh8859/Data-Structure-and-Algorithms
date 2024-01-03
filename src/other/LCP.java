package other;

public class LCP {
    public String lCP(String [] strarr){
        String res = strarr[0];
        for(int i = 1 ; i < strarr.length ; i++){
            String temp = res;
            res="";
            int len = temp.length()<strarr[i].length()?temp.length():strarr[i].length();
            for(int j = 0 ; j < len ; j++){
                if(temp.charAt(j) == strarr[i].charAt(j)){
                    res += strarr[i].charAt(j);
                }
            }
        }
        return res;
    }
}
