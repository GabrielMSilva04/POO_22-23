package aula04.ex1;

public class circle{
    private double raio;

    public double getRaio(){
        return raio;
    }

    public double getArea() {
        return Math.PI*(raio*raio);
    }

    public double getPerimeter() {
        return Math.PI*(2*raio);
    }

    public double setRaio(double raio){
        if (raio > 0){
            this.raio = raio;
        }
        return raio;
    }

    public circle(double r){
        raio = r;
    }

    public String toString() {
        return "Tipo: Circulo"+"\nRaio: "+raio+"\nPerímetro: "+getPerimeter()+"\nArea: "+getArea();
    }

    public boolean equals(Object obj) {
        if (obj instanceof circle) {    
            circle c = (circle) obj; 
            return this.raio == c.raio;   
        }
        return false;
    }
    
}