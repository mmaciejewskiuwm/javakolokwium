import java.time.LocalDate;

public class Biurko extends Mebel{
    private LocalDate dataProdukcji;
    private double przekotnaMonitora;

    public Biurko(String nazwa, double dlugosc, double szerokosc, int iloscNog, double przekotnaMonitora) {
        super(nazwa, dlugosc, szerokosc, iloscNog);
        this.dataProdukcji = LocalDate.now();
        this.przekotnaMonitora = przekotnaMonitora;
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }

    public void setDataProdukcji(int rok,int miesiac,int dzien) {
        this.dataProdukcji = LocalDate.of(rok,miesiac,dzien);
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder(super.toString());
        text.append("[").append(this.dataProdukcji).append("], ");
        text.append("[").append(this.przekotnaMonitora).append("], ");
        text.append("[").append(this.dataProdukcji.getDayOfWeek()).append("]");
        text.append("[").append(this.dataProdukcji.getDayOfYear()).append("]");
        return text.toString();
    }
    @Override
    public boolean equals(Object temp){
        if (getClass() != temp.getClass())
            return false;
        Biurko other = (Biurko) temp;
        return super.equals((Mebel) temp) && other.dataProdukcji == this.dataProdukcji &&
                other.przekotnaMonitora == this.przekotnaMonitora;
    }
}
