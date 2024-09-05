package main;

public class SegmentoReta extends ObjetoGeometrico {
    private final Ponto p1;
    private final Ponto p2;
    public SegmentoReta (Ponto p1, Ponto p2) {
        this.p1 = new Ponto(p1);
        this.p2 = new Ponto(p2);
    }
    
    
    public double comprimento() {
        double d = (p1.getCoordX() - p2.getCoordX()) * (p1.getCoordX() - p2.getCoordX()) +
        (p1.getCoordY() - p2.getCoordY()) * (p1.getCoordY() - p2.getCoordY());
        return Math.sqrt(d);
    }

    public double coeficienteAngular() {
        if (p2.getCoordX() - p1.getCoordX() == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return (p2.getCoordY() - p1.getCoordY()) / (p2.getCoordX() - p1.getCoordX());
    }

    public boolean paralelo(SegmentoReta s) {
        return (this.coeficienteAngular() == s.coeficienteAngular());
    }
    
    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }
    
}
