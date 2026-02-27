import java.util.*;
public class LongestCommonPrefix {
        private static String longestCommonPrefix(String[] arr,int n){
                StringBuilder res = new StringBuilder();
                Arrays.sort(arr);
                String first = arr[0];
                String last = arr[n-1];
                for(int i=0;i<Math.min(first.length(),last.length());i++){
                        if(first.charAt(i)!=last.charAt(i)){
                                return res.toString();
                        }
                        res.append(first.charAt(i));
                }
                return res.toString();
        } 
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                String[] arr = new String[n];
                for(int i=0;i<n;i++){
                        arr[i] = sc.next();
                }
                String res = "";
                res = longestCommonPrefix(arr,n);
                if(res.length()==0) System.out.println(-1);
                else System.out.println(res);

        }
    
}
