package dev.martabernardo.controllers;

import dev.martabernardo.services.SecuenceService;

public class SecuenceController {
    private static SecuenceController instance;

    private SecuenceController() {}

    public static SecuenceController getInstance() {
        if (instance == null) {
            instance = new SecuenceController();
        }
        return instance;
    }

    public String requestSecuence(String adnSecuence) {
        SecuenceService secuenceService = SecuenceService.getInstance();
        return secuenceService.transcribe(adnSecuence);
    }

}
