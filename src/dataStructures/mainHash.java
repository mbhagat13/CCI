package dataStructures;

public class mainHash {
    public static void main(String[] args){
        HashTableCustom h1 = new HashTableCustom();

        h1.addToHash(1);
        h1.addToHash(2);
        h1.addToHash(3);
        h1.addToHash(4);
        h1.addToHash(5);
        h1.addToHash(6);
        h1.addToHash(3567);
        h1.addToHash(54);

        h1.outputHash();
        System.out.println(h1.hashContains(55));
    }
}
