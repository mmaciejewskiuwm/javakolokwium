import java.util.Objects;

public class Mebel {
    private final String nazwa;
    private final double dlugosc;
    private final double szerokosc;
    private final int iloscNog;
    static int ile;
    public Mebel(String nazwa, double dlugosc, double szerokosc, int iloscNog)
    {
        this.nazwa = nazwa;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.iloscNog = iloscNog;
        ile++;
    }
    public Mebel(double dlugosc,double szerokosc,int iloscNog){
        this("Jakis Mebel",dlugosc, szerokosc, iloscNog);
    }
    public String getNazwa(){
        return nazwa;
    }
    public double getDlugosc(){
        return dlugosc;
    }
    public double getSzerokosc(){
        return szerokosc;
    }
    public int getIloscNog(){
        return iloscNog;
    }
    public int getIle(){
        return ile;
    }
    public String toString(){
        if(Objects.equals(nazwa, "Jakis Mebel")){
            return this.getClass().getName() + "["+ dlugosc + ","
                    + szerokosc + "," + iloscNog +"]";
        }
        else return this.getClass().getName() + "["+ nazwa + "," + dlugosc + ","
                + szerokosc + "," + iloscNog +"]";

    }
    public boolean equals(Mebel pierw, Mebel drugi){
        return pierw.iloscNog == drugi.iloscNog && pierw.dlugosc == drugi.dlugosc
                && pierw.szerokosc == drugi.szerokosc && Objects.equals(pierw.nazwa, drugi.nazwa);
    }
}
