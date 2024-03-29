package algorithm;

public class ActivitySelection {
    private void printMaxActivities(int s[], int f[],
            int n) {
        int i, j;

        System.out.println(
                "Following activities are selected");

        i = 0;
        System.out.print(i + " ");

        for (j = 1; j < n; j++) {
            if (s[j] >= f[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
        System.out.println();
    }

    public void run() {
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };
        int n = s.length;

        printMaxActivities(s, f, n);
    }
}
