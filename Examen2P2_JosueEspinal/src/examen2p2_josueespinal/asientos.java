
package examen2p2_josueespinal;

public class asientos {
    private String material;
    private boolean electrico;
    private boolean masaje;

    public asientos() {
    }

    public asientos(String material, boolean electrico, boolean masaje) {
        this.material = material;
        this.electrico = electrico;
        this.masaje = masaje;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    

    public boolean isMasaje() {
        return masaje;
    }

    public void setMasaje(boolean masaje) {
        this.masaje = masaje;
    }

    @Override
    public String toString() {
        return "asientos{" + "material=" + material + ", electrico=" + electrico + ", masaje=" + masaje + '}';
    }

    
    
}
