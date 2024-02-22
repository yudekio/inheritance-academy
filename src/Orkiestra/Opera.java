package Orkiestra;

import java.util.ArrayList;

public class Opera  {
    public static void main(String[] args) {
        ///utwórz obiekty i uruchom na nich dostępne metody
        Guitar guitar = new Guitar();
        GuitarElectric guitarElectric = new GuitarElectric();
        Flute flute = new Flute();
        Trombone trombone = new Trombone();
        guitar.play();
        guitar.wycisz();
        flute.play();
        trombone.play();
        guitarElectric.play();

        ArrayList<Instrument> instrumenty = new ArrayList<>();
        instrumenty.add(new Guitar());
        ///dodaj do listy wszystkie istrumenty
        instrumenty.add(new Trombone());
        instrumenty.add(new Flute());
        instrumenty.add(new GuitarElectric());

        for (Instrument i : instrumenty) {
            ///uruchom grę intrumentów;
            i.play();
        }

    }
}
