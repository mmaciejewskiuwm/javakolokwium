public class Main {
    public static void main(String[] args) {
        Mebel maly = new Mebel("Maly Mebel",1,0.5,4);
        System.out.println(maly);
        System.out.println(maly.getIle());
        Mebel sredni = new Mebel(2,1,4);
        System.out.println(sredni);
        Biurko malebiurko = new Biurko("Male Biurko",2,1,4,22);
        malebiurko.setDataProdukcji(2008,2,28);
        System.out.println(malebiurko);
        System.out.println(malebiurko.getIle());
        int wiersze = 2;
        int kolumny = 2;
        Object[][] spis = new Object[kolumny][wiersze];
        spis[0][0] = new Object[]{maly,sredni};
        spis[0][1] = malebiurko;
        System.out.println();
        for(int i = 0;i<kolumny;i++){
            for(int j=0;j<wiersze;j++){
                if(spis[i][j] instanceof Object[] zagniezdzone){
                    for (int k = 0; k < zagniezdzone.length; k++) {
                        System.out.print(zagniezdzone[k] + " ");
                    }
                }
                else
                    System.out.println(spis[i][j]+ " ");
            }
            System.out.println();
        }
        String[] spisNazw = new String[3];
        spisNazw[0] = sredni.getNazwa();
        spisNazw[1] = maly.getNazwa();
        spisNazw[2] = malebiurko.getNazwa();
        for(String nazwa : spisNazw){
            System.out.println(nazwa);
        }
        int suma = 0;
        for(int i = 0;i<kolumny;i++){
            for(int j=0;j<wiersze;j++) {
                if(spis[i][j]!=null) {
                    if (spis[i][j] instanceof Object[] zagniezdzone) {
                        for (int k = 0; k < zagniezdzone.length; k++) {
                            suma++;
                        }
                    } else
                        suma++;
                }
            }
        }
        System.out.println("ilosc biurek = " + suma);
        StringBuilder zad18 = new StringBuilder();
        for(int i = 0;i<kolumny;i++){
            for(int j=0;j<wiersze;j++){
                if(spis[i][j]!=null) {
                    if(spis[i][j] instanceof Object[] zagniezdzone){
                        for (int k = 0; k < zagniezdzone.length; k++) {
                            zad18.append(zagniezdzone[k].getClass().toString());
                            zad18.append(",");
                        }
                    }
                    else {
                        zad18.append(spis[i][j].getClass());
                        zad18.append(",");
                    }
                }
            }
        }
        System.out.println(zad18);
    }
}
