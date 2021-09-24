
package examen2p2_josueespinal;

public class carroceria {
    private String tipo;
    private int maletero;

    public carroceria() {
    }

    public carroceria(String tipo, int maletero) {
        this.tipo = tipo;
        this.maletero = maletero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMaletero() {
        return maletero;
    }

    public void setMaletero(int maletero) {
        this.maletero = maletero;
    }

    @Override
    public String toString() {
        return "carroceria{" + "tipo=" + tipo + ", maletero=" + maletero + '}';
    }
    
}
