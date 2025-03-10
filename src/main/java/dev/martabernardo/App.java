package dev.martabernardo;

import dev.martabernardo.controllers.SecuenceController;

public final class App {
    private App() {
    }
    public static void main(String[] args) {
        SecuenceController secuenceController = SecuenceController.getInstance();
        String adnSecuence = "ATCG";
        String result = secuenceController.requestSecuence(adnSecuence);
        System.out.println("DNA Secuence: " + adnSecuence);
        System.out.println("RNA Secuence: " + result);
        adnSecuence = "CCGA";
        result = secuenceController.requestSecuence(adnSecuence);
        System.out.println("DNA Secuence: " + adnSecuence);
        System.out.println("RNA Secuence: " + result);
    }
}
