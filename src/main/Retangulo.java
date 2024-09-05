package main;

public class Retangulo extends Paralelogramo {
    public Retangulo (Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }
    
    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        return p1.getCoordX() == p4.getCoordX() && p2.getCoordX() == p3.getCoordX() &&
        p1.getCoordY() == p2.getCoordY() && p3.getCoordY() == p4.getCoordY();
    }

    public boolean quadrado() {
        SegmentoReta s1 = new SegmentoReta(getP1(), getP2());
        SegmentoReta s2 = new SegmentoReta(getP1(), getP4());

        if (s1.coeficienteAngular() * s2.coeficienteAngular() == -1) {
            return true;
        }
        return false;
    }
}
