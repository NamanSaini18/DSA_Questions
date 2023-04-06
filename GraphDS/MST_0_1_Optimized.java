package GraphDS;

import java.util.*;

public class MST_0_1_Optimized
{

    static HashSet<Integer>[] arr;
    static HashSet<Integer> set;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        arr = new HashSet[n];

        for(int i=0; i<n; i++) {
            arr[i] = new HashSet<>();
        }

        for(int i=0; i<m; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            arr[a].add(b);
            arr[b].add(a);
        }

        set = new HashSet<>();



        for(int i=0; i<n; i++) {
            set.add(i);
        }

        int ans = 0;
        for(int i=0; i<n; i++) {
            if(set.remove(i)) {
                ans++;
                dfs(i);
            }
        }
        System.out.println(ans - 1);
    }

    public static void dfs(int x) {
        List<Integer> ll = new ArrayList<>();
        for(int i : set) {
            if(!arr[x].contains(i)) {
                ll.add(i);
            }
        }

        for(int i : ll) {
            set.remove(i);
        }

        // neighbours ke upar phir se dfs laga rhe hai
        for(int i : ll) {
            dfs(i);
        }
    }


}