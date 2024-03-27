import java.util.*;

public class Solut {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
     
        System.out.print(solve(n, arr, k));
    }

    public static int solve(int n, int arr[], int k) {
        int l = Integer.MAX_VALUE;
        int r = 0;
        for (int i = 0; i < n; i++) {
            l = Math.min(l, arr[i]);
            r += arr[i];
        }
        while (l < r) {
            int m = l + (r - l) / 2;

            if (helper(arr, m) < k) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;

    }

    public static int helper(int arr[], int k) {
        int i = 0;
        int n = arr.length;
        int cnt = 0;
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += arr[j];
            while (sum > k) {
                sum -= arr[i];
                i++;

            }
            cnt += j - i + 1;
        }
        return cnt;
    }
}