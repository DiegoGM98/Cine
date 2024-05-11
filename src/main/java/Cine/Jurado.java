package Cine;
import java.util.ArrayList;

class Jurado extends Participante {
    private ArrayList<Aviso> avisos;

    public Jurado(String nombre) {
        super(nombre);
        this.avisos = new ArrayList<>();
    }

    public void addAviso(Aviso aviso) {
        avisos.add(aviso);
    }

    public ArrayList<Aviso> getAvisos() {
        return avisos;
    }
}

