import java.util.Scanner;

public class saltBoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.next().split(":");
        String[] arr1 = sc.next().split(":");

        int aH = Integer.parseInt(arr[0]);
        int aM = Integer.parseInt(arr[1]);
        int aS = Integer.parseInt(arr[2]);

        int tH = Integer.parseInt(arr1[0]);
        int tM = Integer.parseInt(arr1[1]);
        int tS = Integer.parseInt(arr1[2]);

        int tA = aH * 3600 + aM * 60 + aS;
        int tA1 = tH * 3600 + tM * 60 + tS;

        int need = tA1 - tA;
        if (need  <= 0 ) need += 24 * 3600;

        int nH = need / 3600;
        int nM = (need%3600) / 60;
        int nS = need % 60;

        System.out.printf("%02d:%02d:%02d",nH,nM,nS);
    }
}

