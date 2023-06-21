package ds;

import java.util.Random;

class UniversalHashing {
    private int prime;
    private int[] a;
    private int[] b;

    UniversalHashing(){}

    UniversalHashing(int prime, int size) {
        this.prime = prime;
        this.a = new int[size];
        this.b = new int[size];
        generateHashCoefficients(size);
    }

    private void generateHashCoefficients(int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(prime - 1) + 1;
            b[i] = random.nextInt(prime);
        }
    }

    private int hashFunction(int key, int index) {
        return ((a[index] * key + b[index]) % prime) % prime;
    }

    public int hash(int key) {
        int index = key % a.length;
        return hashFunction(key, index);
    }

    public void run() {
        UniversalHashing universalHashing = new UniversalHashing(101, 10);

        int[] keys = {12, 45, 67, 34, 98, 23, 56, 78, 90, 11};

        for (int key : keys) {
            int hash = universalHashing.hash(key);
            System.out.println("Key: " + key + ", Hash: " + hash);
        }
    }
}

    


