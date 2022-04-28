package composite;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class Angajat implements iAngajat {
    private String nume;
    private String codAngajat;
    private float salariu;
    private List<Angajat> subordonati;

    public Angajat(String nume, String codAngajat, float salariu) {
        this.nume = nume;
        this.codAngajat = codAngajat;
        this.salariu = salariu;
        this.subordonati=new ArrayList<>();


    }

    public void addSubordonat(Angajat angajat) {
        subordonati.add(angajat);
    }

    public void deleteSubordonat(Angajat angajat) {
        subordonati.remove(angajat);

    }

    @Override
    public void prinDetalii() {
        System.out.println("nume" + nume + ","+"conAngajat"+ codAngajat + "salariu" + salariu);
        for(iAngajat iang : subordonati)
        {
            System.out.println(iang);
        }


    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", codAngajat='" + codAngajat + '\'' +
                ", salariu=" + salariu +
                ", subordonati=" + subordonati +
                '}';
    }
}

