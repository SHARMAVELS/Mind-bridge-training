import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] g = new int[n];
        for(int i=0;i<n;i++){
            g[i] = in.nextInt();
        }
        int max=0;
        int cu = 0;
        for(int i=0;i<n;i++){
            cu+=g[i];
            max = Math.max(max,cu);
        }
        System.out.println("max alti: "+max);
    }
}