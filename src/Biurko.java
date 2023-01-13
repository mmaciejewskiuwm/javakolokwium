import java.time.LocalDate;

public class Biurko extends Mebel {
    private LocalDate dataProdukcji;
    private double przekatnaMonitora;
    public Biurko(String nazwa, double dlugosc, double szerokosc,int iloscNog,
                  double przekatnaMonitora) {
        super(nazwa,dlugosc,szerokosc,iloscNog);
        this.dataProdukcji = LocalDate.now();
        this.przekatnaMonitora = przekatnaMonitora;
    }
    public void setDataProdukcji(int rok, int miesiac, int dzien){
        this.dataProdukcji = LocalDate.of(rok,miesiac,dzien);
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }

    public double getPrzekatnaMonitora() {
        return przekatnaMonitora;
    }
    @Override
    public String toString(){
        String tekst = super.toString();

        return tekst.substring(0,tekst.length()-1) +
                "," + dataProdukcji +","+ przekatnaMonitora + "]";
    }

    public boolean equals(Biurko pierw, Biurko drugi){
        return super.equals(pierw,drugi) && pierw.dataProdukcji == drugi.dataProdukcji &&
                pierw.przekatnaMonitora == drugi.przekatnaMonitora;
    }
}
