package oop.factory;

public class main {

    public static void main (String[] args){

        Encryptor test = new Sha256Encryptor();
        Encryptor test2 = new Sha512Encryptor();

        System.out.println(test.encrypt("test"));

        System.out.println(test2.encrypt("test2"));


    }
}
