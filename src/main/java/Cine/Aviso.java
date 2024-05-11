package Cine;

class Aviso {
    private String categoria;
    private boolean ganadorElegido;

    public Aviso(String categoria, boolean ganadorElegido) {
        this.categoria = categoria;
        this.ganadorElegido = ganadorElegido;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isGanadorElegido() {
        return ganadorElegido;
    }
}
