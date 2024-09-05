package main;

public abstract class Quadrilatero extends Poligono {
    public Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(new Ponto[] {p1, p2, p3, p4});
    }
}
