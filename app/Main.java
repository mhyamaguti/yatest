package app;

import dados.*;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(123);
        int n = c.getNumero();
        System.out.println("Numero: " + n);
    }
}
