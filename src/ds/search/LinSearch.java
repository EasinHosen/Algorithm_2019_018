package ds.search;

import io.*;

public class LinSearch {
    public void linearSearch() {
        Input in = new Input();
        Output out = new Output();

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
            out.searchResultFoundOutput(key, i);
        else
            out.searchResultNotFoundOutput(key);

    }
}
