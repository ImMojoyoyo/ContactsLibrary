import java.util.*;


public class Main {
    public static void main(String[] args){
        Hashtable<Integer, String> lista = new Hashtable<Integer, String>();

        int opcion;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        do{
            System.out.println("Añadir contacto");
            System.out.println("Eliminar contacto");
            System.out.println("Mostrar contactos");
            System.out.println("Salir");

            opcion = sc.nextInt();
            String nombre;
            Integer dni;

            switch(opcion){
                case1:
                    System.out.println("Introduce Nombre: ");
                    nombre = sc.next();
                    System.out.println("DNI: ");
                    dni = sc.nextInt();
                    guardarContacto(nombre, dni, lista);
                    break;
                case2:
                    System.out.println("Introduzca el DNI: ");
                    dni = sc.nextInt();
                    eliminarContacto(dni, lista);
                    break;
                case3:
                    mostrarContactos(lista);
                    break;
            }

        }while(opcion != 4);
    }


    static void guardarContacto(String valor, Integer clave,
                                Hashtable<Integer, String> lista){
        if(lista.containsKey(clave)){
            lista.remove(clave);
        }
    }

    static void eliminarContacto(Integer clave,
                                 Hashtable<Integer, String> lista){
        if(lista.containsKey(clave)){
            lista.remove(clave);
        }
    }

    static void mostrarContactos(Hastable<Integer, String> lista){
        System.out.println("Los contactos son: ");
        Enumeration<Integer> claves = lista.keys();
        while (claves.hasMoreElements()){
            Integer k = claves.nextElement();
            System.out.println(k.toString() + " - " + lista.get(k));
        }
    }
}
