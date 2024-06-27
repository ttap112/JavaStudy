package ex;

import java.util.*;

public class dopleganger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<String> nameList = new HashSet<>();
        for (int i = 0; i<n; i++) {
            nameList.add(sc.next());
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i<m; i++) {
            String name = sc.next();
            if (nameList.contains(name)) {
                ans.add(name);
            }
        }
        Collections.sort(ans);
        System.out.println(ans.size());
        for (String s : ans) {
            System.out.println(s);
        }
    }
}