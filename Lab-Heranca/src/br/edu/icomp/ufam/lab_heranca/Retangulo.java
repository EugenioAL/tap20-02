package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica{
    public double largura;
    public double altura;

    public Retangulo(int posX, int posY, double largura, double altura){
        super(posX,posY);
        this.posX = posX;
        this.posY = posY;
        this.largura = largura;
        this.altura = altura;
    }

    public double getArea(){
        double area = largura * altura;
        return area;

    }

    public double getPerimetro(){
        double perimetro = 2*(largura + altura);
        return perimetro;
    }

    public String toString(){
        String descricao = "Retângulo na posição (" + this.posX + ", " + this.posY + ") com largura de " +
        this.largura + "cm e altura de " + this.altura + "cm (área=" + this.getArea() + "cm2, perímetro=" + this.getPerimetro() +
        "cm)" ;
        return descricao;
    }
}
