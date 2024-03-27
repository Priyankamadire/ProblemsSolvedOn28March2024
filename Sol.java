import java.util.*;
public class Sol{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String k = sc.next();
        System.out.print(solve(s,k));
    }
    public static int solve(String s,String k){
        int n = s.length();
        int m = k.length();
        int cnt=0;
        char ck = s.charAt(0);
        for(int i=0;i<m;i++){
            char k1 = k.charAt(i);
            int ind = s.indexOf(k1);
            int d = Math.abs(s.indexOf(ck)-ind);
            cnt+=d;
            
            ck=k1;
        }
        return cnt;
    }
}