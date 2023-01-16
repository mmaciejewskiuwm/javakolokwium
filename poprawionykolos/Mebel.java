import java.util.Objects;

public class Mebel {
    private String nazwa;
    private double dlugosc;
    private double szerokosc;
    private int iloscNog;
    private static int ile;

    public Mebel(String nazwa, double dlugosc, double szerokosc, int iloscNog) {
        this.nazwa = nazwa;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.iloscNog = iloscNog;
        ile++;
    }

    public Mebel(double dlugosc, double szerokosc, int iloscNog) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.iloscNog = iloscNog;
        this.nazwa = "Jakis Mebel";
        ile++;
    }

    public static int getIle() {
        return ile;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public int getIloscNog() {
        return iloscNog;
    }
    @Override
    public String toString(){
        StringBuilder text = new StringBuilder();
        text.append(this.getClass().getName());
        if(!nazwa.equals("Jakis Mebel")){
            text.append(" [").append(this.nazwa).append("], ");
        }
        text.append("[").append(this.dlugosc).append("], ");
        text.append("[").append(this.szerokosc).append("], ");
        text.append("[").append(this.iloscNog).append("]");
        return text.toString();
    }
    @Override
    public boolean equals(Object temp){
        if(this == temp)
            return true;
        if (getClass() != temp.getClass())
            return false;
        Mebel other = (Mebel) temp;
        return Objects.equals(this.nazwa, other.nazwa) && this.dlugosc == other.dlugosc && this.szerokosc == other.szerokosc
                && this.iloscNog == other.iloscNog;
    }
}
