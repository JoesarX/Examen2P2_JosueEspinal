package examen2p2_josueespinal;

public class bateria {
    private int autonomia;
    private String  material;

    public bateria() {
    }

    public bateria(int autonomia, String material) {
        this.autonomia = autonomia;
        this.material = material;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "bateria{" + "autonomia=" + autonomia + ", material=" + material + '}';
    }

    
    
}
