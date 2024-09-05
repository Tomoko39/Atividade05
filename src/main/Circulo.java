package main;

public class Circulo extends Elipse {
    public Circulo(Ponto centro, double raio) {
        super(centro, raio, raio);
    }
    
    public double getRaio() {
        return getSemiEixoMaior();
    }
    
    @Override
    public double circunferencia() {
        return Math.PI * 2 * getRaio();
    }
}
