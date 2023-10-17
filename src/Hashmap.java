import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        //creamos una hashmap que es lo mismo que un diccionario
        //**tenemos que investigar mas sobre la libreria hashmap**
        HashMap <Integer, String> jugadores = new HashMap<Integer, String>();
        jugadores.put(10,"billy");
        jugadores.put(7,"cristiano");
        System.out.println(jugadores);
    }
}
