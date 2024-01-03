package other;

class temp{
    public static void main(String[] args) {
        int n=12454;
        int mod=n%10;
        n/=10;
        int dummy= n;
        while(dummy>0){
            dummy/=10;
            mod*=10;
        }
        System.out.println(mod);
        System.out.println((mod+n));
    }
}