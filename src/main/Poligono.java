package main;

public abstract class Poligono extends FormaGeometrica{
    protected final Ponto[] pontos;

    public Poligono(Ponto[] pontos) {
        this.pontos = pontos;
    }

    Ponto[] getPontos() {
        return pontos;
    }
}
