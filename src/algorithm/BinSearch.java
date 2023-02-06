package algorithm;

public class BinSearch {
    public void binarySearch() {
        Input in = new Input();
        System.out.println("\n---Binary Search selected---");
        System.out.println("\n\tInput must be sorted ASC!\n");

        int list[] = in.listInput();
        // int list[] = {12, 11, 13, 5, 6};
        int key = in.keyInput();
        int h, l, m = -1;
        boolean found = false;

        l = 0;
        h = list.length - 1;
        while (l <= h) {
            m = (l + h) / 2;

            if (key == list[m]) {
                found = true;
                break;
            } else if (key < list[m])
                h = m - 1;
            else
                l = m + 1;
        }
        if (found)
            System.out.println("Key(" + key + ")found at index: " + m);
        else
            System.out.println("Key not found.");

    }
}
