package oop.factory;

public class main {

    public static void main (String[] args){

        Encryptor test = new Sha256Encryptor();

        System.out.println(test.encrypt("test"));


    }
}
