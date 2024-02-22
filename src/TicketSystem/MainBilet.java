package TicketSystem;

public class MainBilet {
        public static void main(String[] args) {
            Bilet bilet = new Bilet("Jan", "Kowalski", "jan.kowalski@example.com", 123456789);
            BiletUlgowy biletUlgowy1 = new BiletUlgowy("Anna", "Nowak", "anna.nowak@example.com", 987654321, "Studencki", 30);
            BiletUlgowy biletUlgowy2 = new BiletUlgowy("Piotr", "Wiśniewski", "piotr.wisniewski@example.com", 555666777);

            biletUlgowy1.pokazCenePoZnizce();
            biletUlgowy2.pokazCenePoZnizce();
        }
}
