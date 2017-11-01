package sample;
public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    private static Persona[] listaPersonas = {
            new Persona("David","Delcid",20),
            new Persona("Alaster","Erazo",24),
            new Persona("Juan","Velis",22),
            new Persona("Josue","Cordoba",20),
            new Persona("Yarince","Padilla",27),
            new Persona("Oscar","Diaz",25),
            new Persona("Orlando","Calix",22),

    };

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static void buscarPorPosicion(String nombre) {
        for (int i =0;i<listaPersonas.length;i++){
            if (listaPersonas[i].nombre.startsWith(nombre) || listaPersonas[i].apellido.startsWith(nombre) || listaPersonas[i].apellido.endsWith(nombre) || listaPersonas[i].nombre.endsWith(nombre) ) {
                System.out.println(listaPersonas[i].nombre+" "+listaPersonas[i].apellido+" "+listaPersonas[i].edad);
            }

        }
    }


}
