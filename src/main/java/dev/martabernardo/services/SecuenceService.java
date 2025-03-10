package dev.martabernardo.services;

public class SecuenceService {
    private static SecuenceService instance;

    private SecuenceService() {}

    public static SecuenceService getInstance() {
        if (instance == null) {
            instance = new SecuenceService();
        }    
        return instance;
    }

}
