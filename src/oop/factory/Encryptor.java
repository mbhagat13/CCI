package oop.factory;

public abstract class Encryptor {

    public String encrypt(String plaintext) {

        EncryptionAlgorithm algo = getEncryptionAlgorithm();
        return algo.encrypt(plaintext);


    }
    public abstract EncryptionAlgorithm getEncryptionAlgorithm();

}
