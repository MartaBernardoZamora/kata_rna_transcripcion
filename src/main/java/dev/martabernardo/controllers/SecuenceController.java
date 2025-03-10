package dev.martabernardo.controllers;

public class SecuenceController {
    private static SecuenceController instance;

    private SecuenceController() {}

    public static SecuenceController getInstance() {
        if (instance == null) {
            instance = new SecuenceController();
        }
        return instance;
    }

}
