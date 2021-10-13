package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica{

    public double raio;

    public Circulo(int posX,int posY, double raio){
        super(posX,posY);
        this.posX = posX;
        this.posY = posY;
        this.raio = raio;
    }

    public double getArea(){
        double area;
        System.out.print(this.raio);
        area = this.raio*(Math.PI)*this.raio;
        return area;
    }

    public double getPerimetro(){
        double perimetro = 2*raio*Math.PI;
        return perimetro;
    }

    public String toString(){
        String descricao = "Círculo na posição (" + this.posX + ", " + this.posY + ") " + 
        "com raio de " + this.raio + "cm " + "(área=" + this.getArea() + "cm2, perímetro=" + this.getPerimetro()
        +  "cm)";
        return descricao; 

    }
}
