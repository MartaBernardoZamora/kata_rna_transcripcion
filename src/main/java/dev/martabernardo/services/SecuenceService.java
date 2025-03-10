package dev.martabernardo.services;


import dev.martabernardo.models.DnaSecuence;
import dev.martabernardo.models.Nucleotides;
import dev.martabernardo.models.RnaSecuence;

public class SecuenceService {
    private static SecuenceService instance;

    private SecuenceService() {}

    public static SecuenceService getInstance() {
        if (instance == null) {
            instance = new SecuenceService();
        }    
        return instance;
    }

    public String transcribe(String adnSecuence) {
        DnaSecuence adn = new DnaSecuence(adnSecuence);
        StringBuilder rnaSequence = new StringBuilder();
        for (char nucleotide : adn.getSecuence().toCharArray()) {
            boolean found = false;
            for (Nucleotides n : Nucleotides.values()) {
                if (n.getDnaNucleotide().equals(String.valueOf(nucleotide))) {
                    rnaSequence.append(n.getRnaNucleotide());
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new IllegalArgumentException("Invalid nucleotide: " + nucleotide);
            }
        }
        RnaSecuence rna = new RnaSecuence(rnaSequence.toString());
        return rna.getSecuence();
    }

}
