package main;

public class Trapezio extends Quadrilatero {
    private final SegmentoReta p1p2 = new SegmentoReta(pontos[0], pontos[1]);
    private final SegmentoReta p3p4 = new SegmentoReta(pontos[2], pontos[3]);
    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }
    SegmentoReta baseMaior() {
        if (p1p2.comprimento() > p3p4.comprimento()) {
            return p1p2;
        }
        return p3p4;
    }

    SegmentoReta baseMenor() {
        if (p1p2.comprimento() <= p3p4.comprimento()) {
            return p1p2;
        }
        return p3p4;
    }

    static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta p1p2 = new SegmentoReta(p1, p2);
        SegmentoReta p3p4 = new SegmentoReta(p3, p4);
        return p1p2.paralelo(p3p4);
    }

    @Override
    double area() {
        return (p1p2.comprimento() + p3p4.comprimento());
    }

    @Override
    double largura() {
        return baseMaior().comprimento();
    }

    @Override
    double altura() {
        return Math.abs(pontos[1].getCoordY() - pontos[2].getCoordY());
    }

    @Override
    public double perimetro() {
        SegmentoReta s1 = new SegmentoReta(pontos[0], pontos[1]);
        SegmentoReta s2 = new SegmentoReta(pontos[1], pontos[2]);
        SegmentoReta s3 = new SegmentoReta(pontos[2], pontos[3]);
        SegmentoReta s4 = new SegmentoReta(pontos[3], pontos[0]);
        return s1.comprimento() + s2.comprimento() + s3.comprimento() + s4.comprimento();
    }
}
