package recursion.recursionSubset;
import java.util.ArrayList;

public class CombinationRecusion {
    public static void comb(String s , String emp, ArrayList<String> res){
        if(s==""&& emp=="")
            return;
        if(s==""){
            res.add(emp);
            return;
        }
        comb(s.substring(1),(emp+s.charAt(0)), res);
        comb(s.substring(1),emp, res);
    }

    public static void main(String[] args) {
        ArrayList<String> res = new ArrayList<>();
        comb("abc", "", res);
        System.out.println(res);
        res.clear();
        comb("Anand","",res);
        System.out.println(res);
    }
}
