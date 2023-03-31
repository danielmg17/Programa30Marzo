
import java.util.*;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List MiLista = new ArrayList();
        MiLista.add(10);
        MiLista.add("Hola Mundo");
        MiLista.add(10.50);
        MiLista.add(true);
        
        System.out.println(MiLista);
        System.out.println("-----Otra forma de recorerrlo ");
        MiLista.forEach(dato->{});
    }
    
}
