package aula04.ex1;

public class triangle{
    private double lado1;
    private double lado2;
    private double lado3;

    public double getLado(int lado){
        switch (lado) {
            case 1:
                return lado1;
            case 2:
                return lado2;
            case 3:
                return lado3;
            default:
                return 0;
        }
    }

    public double setLado(int lado, double comprimento){
        assert lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1 : "Os lados do triângulo têm de satisfazer a desigualdade triangular";
        switch (lado){
            case 1:
                if (comprimento > 0){
                    this.lado1 = comprimento;
                }
                return lado1;
            case 2:
                if (comprimento > 0){
                    this.lado2= comprimento;
                }
                return lado2;
            case 3:
                if (comprimento > 0){
                    this.lado3 = comprimento;
                }
                return lado3;
            default:
                return 0;
        }
    }

    public double getArea() {
        double p = (lado1+lado2+lado3)/2;
        return Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
    }

    public double getPerimeter() {
        return lado1+lado2+lado3;
    }

    public triangle(double l1, double l2, double l3){
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
    }

    public String toString() {
        return "Tipo: Triangulo"+"\nLado 1: "+lado1+"\nLado 2: "+lado2+"\nLado 3: "+lado3+"\nPerímetro: "+getPerimeter()+"\nArea: "+getArea();
    }

    public boolean equals(Object obj) {
        if (obj instanceof triangle) {    
            triangle t = (triangle) obj; 
            return this.lado1 == t.lado1 && this.lado2 == t.lado2 && this.lado3 == t.lado3;
        }
        return false;
    }

}