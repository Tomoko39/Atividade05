package main;

public class Elipse extends FormaGeometrica {
    private final Ponto centro;
    private final double semiEixoA;
    private final double semiEixoB;

    public Elipse(Ponto centro, double semiEixoA, double semiEixoB) {
        if (semiEixoA <= 0 || semiEixoB <= 0) {
            throw new IllegalArgumentException("os semi-eixos devem ser maiores que zero");
        }
        this.centro = new Ponto(centro);
        this.semiEixoA = semiEixoA;
        this.semiEixoB = semiEixoB;
    }
    
    public Ponto getCentro() {
        return centro;
    }

    public double getSemiEixoMaior() {
        return Math.max(semiEixoA, semiEixoB);
    }

    public double getSemiEixoMenor() {
        return Math.min(semiEixoA, semiEixoB);
    }

    public double circunferencia() {
        return Math.sqrt((semiEixoA*semiEixoA + semiEixoB*semiEixoB)/2) * 2 * Math.PI;
    }

    @Override
    public double perimetro() {
        return circunferencia();
    }

    @Override
    public double area() {
        return Math.PI * semiEixoA * semiEixoB;
    }

    @Override
    public double largura() {
        return getSemiEixoMaior() * 2;
    }

    @Override
    public double altura() {
        return getSemiEixoMenor() * 2;
    }
}
