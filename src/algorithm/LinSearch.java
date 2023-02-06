package algorithm;

public class LinSearch {
    public void linearSearch() {
        Input in = new Input();
        System.out.println("\n---Linear Search selected---");

        int list[] = in.listInput();
        int key = in.keyInput();
        int i = 0;
        boolean found = false;

        for (i = 0; i < list.length; i++) {
            if (key == list[i]) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Key(" + key + ")found at index: " + i);
        else
            System.out.println("Key not found.");

    }
}
