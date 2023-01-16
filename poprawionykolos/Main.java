public class Main {
    public static void main(String[] args) {
        Mebel maly = new Mebel("Maly Mebel",1,0.5,4);
        Mebel sredni = new Mebel(2,1,4);
        System.out.println(maly);
        System.out.println(Mebel.getIle());
        System.out.println(sredni);
        Biurko maleBiurko = new Biurko("Male Biurko",2,1,4,22);
        maleBiurko.setDataProdukcji(2005,2,28);
        System.out.println(maleBiurko);
        System.out.println(Mebel.getIle());
        int wiersz=2;
        int kolumna=2;
        Object[][] spis = new Object[wiersz][kolumna];
        spis[0][1] = maly;
        spis[0][0] = sredni;
        spis[1][0] = maleBiurko;
        spis[1][1] = sredni;
        for(int i =0;i<wiersz;i++)
        {
            for(int j=0;j<kolumna;j++){
                System.out.println(spis[i][j]);
            }
        }
        String[] spisNazw = new String[4];
        spisNazw[0] = sredni.getNazwa();
        spisNazw[1] = maly.getNazwa();
        spisNazw[2] = maleBiurko.getNazwa();
        spisNazw[3] = sredni.getNazwa();
        for (String x: spisNazw
             ) {
            System.out.println(x);
        }
        System.out.println(sredni.equals(maly));
        System.out.println(sredni.equals(maleBiurko));
        int ileBiurek =0;
        for(int i =0;i<wiersz;i++)
        {
            for(int j=0;j<kolumna;j++){
                if(spis[i][j].getClass()==Biurko.class)
                    ileBiurek++;

            }
        }
        System.out.println(ileBiurek);
        StringBuilder klasy = new StringBuilder();
        for(int i =0;i<wiersz;i++)
        {
            for(int j=0;j<kolumna;j++){
                klasy.append(spis[i][j].getClass()).append(",");
            }
        }
        System.out.println(klasy);
    }
}

