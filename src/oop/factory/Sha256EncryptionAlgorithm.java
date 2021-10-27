package oop.factory;

public class Sha256EncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String plaintext) {
        return "ENCRYPTED 256";
    }
}
