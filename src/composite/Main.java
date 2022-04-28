package composite;

public class Main {
    public static void main(String[] args) {


        Angajat ceo = new Angajat("Dorian", "1234", 2300);
        Angajat tm1 = new Angajat("Maria", "123", 120);
        Angajat tm2 = new Angajat("Maria", "123", 120);
        ceo.addSubordonat(tm1);
        ceo.addSubordonat(tm2);
        iAngajat ceo2=new Angajat("Ion","1010",4000);
        ((Angajat) ceo2).addSubordonat(tm1);

        Angajat itm1=new Angajat("Andrei","404",5000);
        Angajat itm2=new Angajat("George","1010",3000);
        tm1.addSubordonat(itm1);


        ceo.prinDetalii();
        ceo2.prinDetalii();


    }
}
