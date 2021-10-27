package oop.factory;

public class Sha512EncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String plaintext) {
        return "ENCRYPTED 512";
    }
}
