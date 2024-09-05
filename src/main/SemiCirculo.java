package main;

public class SemiCirculo extends FormaGeometrica {
    private final Ponto centro;
    private final double raio;

    public SemiCirculo(Ponto centro, double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero");
        }
        this.centro = new Ponto(centro);
        this.raio = raio;
    }

    @Override
    double perimetro() {
        return (Math.PI + 2) * raio;
    }

    @Override
    double area() {
        return Math.PI * raio * raio / 2;
    }

    @Override
    double largura() {
        return raio * 2;
    }

    @Override
    double altura() {
        return raio;
    }
}
