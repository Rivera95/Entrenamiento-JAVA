
import java.util.ArrayList;

public class Funciones {
    public static void main(String[] args) {


        // FUNCIONES
        Integer resultado = sumar(3, 4);
        System.out.println(resultado); // Imprime 7
    }

    public static Integer sumar(Integer primero, Integer segundo) {
        return primero + segundo;
    }

    public static int multiplicar(int primero, int segundo) {
        return primero * segundo;
    }

    public static void main1(String[] args) {
        int resultado1 = multiplicar(5, 6);
        System.out.println(resultado1); // Imprime 30
    }

    public static void imprimirElemento(String[] lista) {
        System.err.println(lista[0]); // Imprime el primer elemento del array
    }

    public static void main2(String[] args) {
        String[] animales = {"Perro", "Gato", "Pájaro"};
        imprimirElemento(animales); // Imprime "Perro"
    }

    static ArrayList<Integer> quicksort(ArrayList<Integer> lista) {
        if (lista.size() <= 1) {
            return lista;
        }
        Integer pivote = lista.get(0);
        ArrayList<Integer> menores = new ArrayList<>();
        ArrayList<Integer> mayores = new ArrayList<>();
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < pivote) {
                menores.add(lista.get(i));
            } else {
                mayores.add(lista.get(i));
            }
        }
        ArrayList<Integer> resultado = new ArrayList<>();
        resultado.addAll(quicksort(menores));
        resultado.add(pivote);
        resultado.addAll(quicksort(mayores));
        return resultado;
    }
}

