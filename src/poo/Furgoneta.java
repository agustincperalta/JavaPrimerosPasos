package poo;

public class Furgoneta extends Coche {

    private int capacidad_extra;
    private int plazas_extra;

    public Furgoneta(int capacidad_extra, int plazas_extra) {
        super(); // llama al constructor de la clase padre
        this.capacidad_extra = capacidad_extra;
        this.plazas_extra = plazas_extra;
    }

    public int getCapacidad_extra() {
        return capacidad_extra;
    }

    public String getDatos() {
        return "La capacidad de carga es: " + capacidad_extra +
                " Y las plazas son: " + plazas_extra;
    }
}
