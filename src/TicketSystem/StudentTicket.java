package TicketSystem;

class BiletUlgowy extends Bilet {
    String discountType;
    int discountRate;

    public BiletUlgowy(String imie, String nazwisko, String email, int telefon, String discountType, int discountRate) {
        super(imie, nazwisko, email, telefon);
        this.discountType = discountType;
        this.discountRate = discountRate;
    }

    public BiletUlgowy(String imie, String nazwisko, String email, int telefon) {
        super(imie, nazwisko, email, telefon);
        this.discountType = "Studencki";
        this.discountRate = 20; // Domyślny rabat dla studentów (możesz dostosować według potrzeb)
    }

    public void pokazCenePoZnizce() {
        double cenaPoZnizce = cenaPoZnizce();
        System.out.println("Cena po zniżce: " + cenaPoZnizce + " zł");
    }

    private double cenaPoZnizce() {
        // Tutaj możesz dodać logikę obliczającą cenę po zniżce, na przykład bazującą na discountRate
        // W tym przykładzie, dla uproszczenia, zniżka to discountRate procent
        return (100 - discountRate) / 100.0 * cenaPodstawowa();
    }

    private double cenaPodstawowa() {
        // Tutaj możesz dodać logikę określającą cenę podstawową biletu
        // W tym przykładzie, dla uproszczenia, przyjmujemy cenę podstawową jako 100 zł
        return 100.0;
    }
}



