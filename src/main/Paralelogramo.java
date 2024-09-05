package main;

public class Paralelogramo extends Trapezio {
    public Paralelogramo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        SegmentoReta p1p2 = new SegmentoReta(p1, p2);
        SegmentoReta p2p3 = new SegmentoReta(p2, p3);
        SegmentoReta p3p4 = new SegmentoReta(p3, p4);
        SegmentoReta p4p1 = new SegmentoReta(p4, p1);
        return p1p2.paralelo(p3p4) && p2p3.paralelo(p4p1);
    }
}
