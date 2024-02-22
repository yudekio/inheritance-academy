import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        String[] names = new String[]{"Ala", "Ola", "Asia", "Basia", "Asia", "Ola", "Ela", "Ela", "Ewa", "Ala"};

        ArrayList<String> lista = new ArrayList<>();

        for(String p : names){
            lista.add(p);
        }

        System.out.println(lista);

        HashSet<String> zbior = new HashSet<>();

        for(String p : names){
            zbior.add(p);
        }

        System.out.println(zbior);

        System.out.println(lista.get(2));

        System.out.println(lista.contains("Ola"));

        System.out.println(zbior.contains("Ola"));

        System.out.println(lista.remove("Ola"));

        zbior.remove("Ala");
        System.out.println(zbior);

        while(lista.contains("Ola")) {
            lista.remove("Ola");
        }
        System.out.println(lista);

    }
}