package org.example.Colection.Exo2.Cercle;

public class Cercle {
    private double x;
    private double y;
    private double rayon;

    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public void affiche(){
        System.out.println("Coordonées : "+this.x+" x, "+this.y+" y, rayon : "+this.rayon);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRayon() {
        return rayon;
    }
}
