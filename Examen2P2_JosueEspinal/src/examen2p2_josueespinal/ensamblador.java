package examen2p2_josueespinal;
public class ensamblador {
    private String id;
    private String nombre;
    private char genero;
    private int edad;
    private int ensambles;

    public ensamblador() {
    }

    public ensamblador(String id, String nombre, char genero, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        ensambles = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEnsambles() {
        return ensambles;
    }

    public void setEnsambles(int ensambles) {
        this.ensambles = ensambles;
    }

    @Override
    public String toString() {
        return "ensamblador{" + "id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", ensambles=" + ensambles + '}';
    }
    
    
}
