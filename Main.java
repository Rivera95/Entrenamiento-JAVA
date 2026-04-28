
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");


        // VARIABLES
        String nombre = "Juan";
        int edad = 30;
        double decimal = 1.75;
        boolean autorizado = true;
        boolean seleccionado = false;


        // ARRAYS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        System.out.println(numeros.get(0)); // Imprime 10

        String[] frutas = {"Manzana", "Banana", "Naranja"};
        System.out.println(frutas[1]); // Imprime "Banana"

        List<Object> mixto = new ArrayList<>();
        mixto.add("Texto");
        mixto.add(123);
        mixto.add(true);
        String[] lista = {"Lista dentro de otra lista"};
        mixto.add(lista);
        System.out.println(mixto.get(0)); // Imprime "Texto"


        // HASHMAP
        HashMap<Integer, String> jugadores = new HashMap<>();
        jugadores.put(10, "Messi");
        jugadores.put(7, "Cristiano Ronaldo");
        System.out.println(jugadores.get(10)); // Imprime "Messi"
        System.out.println(jugadores.get(7)); // Imprime "Cristiano"


        HashMap<String, String> paises = new HashMap<>();
        paises.put("AG", "Argentina");
        paises.put("BR", "Brasil");
        System.out.println(paises.get("AG")); // Imprime "Argentina"

        HashMap<String, List<String>> emails = new HashMap<>();
        emails.put("Juan", Arrays.asList("juan@gmail.com"));
        emails.put("Rivera", Arrays.asList("rivera@gmail.com"));
        System.out.println(emails.get("Rivera")); // Imprime "[rivera@gmail.com]"
    }
}

