package examen2p2_josueespinal;

public class vehiculo {
    private String id;
    private String color;
    private String audio;
    private int asientos;
    private bateria bat;
    private carroceria car;
    private interior inte;
    private entretenimiento ent;
    private asientos asi;

    public vehiculo() {
    }

    public vehiculo(String id, String color, String audio, int asientos, bateria bat, carroceria car, interior inte, entretenimiento ent, asientos asi) {
        this.id = id;
        this.color = color;
        this.audio = audio;
        this.asientos = asientos;
        this.bat = bat;
        this.car = car;
        this.inte = inte;
        this.ent = ent;
        this.asi = asi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public bateria getBat() {
        return bat;
    }

    public void setBat(bateria bat) {
        this.bat = bat;
    }

    public carroceria getCar() {
        return car;
    }

    public void setCar(carroceria car) {
        this.car = car;
    }

    public interior getInte() {
        return inte;
    }

    public void setInte(interior inte) {
        this.inte = inte;
    }

    public entretenimiento getEnt() {
        return ent;
    }

    public void setEnt(entretenimiento ent) {
        this.ent = ent;
    }

    public asientos getAsi() {
        return asi;
    }

    public void setAsi(asientos asi) {
        this.asi = asi;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "id=" + id + ", color=" + color + ", audio=" + audio + ", asientos=" + asientos + ", bat=" + bat + ", car=" + car + ", inte=" + inte + ", ent=" + ent + ", asi=" + asi + '}';
    }
    
    
}
