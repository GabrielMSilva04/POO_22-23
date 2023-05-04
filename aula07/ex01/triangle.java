package aula07.ex01;

public class triangle extends Forma{
    private double lado1;
    private double lado2;
    private double lado3;
    private String color;

    public triangle(double l1, double l2, double l3, String color){
        setLado(1, l1);
        setLado(2, l2);
        setLado(3, l3);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //chkdsk /f

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
        switch (lado){
            case 1:
                if (comprimento > 0){
                    this.lado1 = comprimento;
                }
                assert lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1 : "Os lados do triângulo têm de satisfazer a desigualdade triangular";
                return lado1;
            case 2:
                if (comprimento > 0){
                    this.lado2= comprimento;
                }
                assert lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1 : "Os lados do triângulo têm de satisfazer a desigualdade triangular";
                return lado2;
            case 3:
                if (comprimento > 0){
                    this.lado3 = comprimento;
                }
                assert lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1 : "Os lados do triângulo têm de satisfazer a desigualdade triangular";
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

    public String toString() {
        return "Tipo: Triangulo"+"\nLado 1: "+lado1+"\nLado 2: "+lado2+"\nLado 3: "+lado3+"\nPerímetro: "+getPerimeter()+"\nArea: "+getArea()+"\nCor: "+getColor();
    }

    public boolean equals(Object obj) {

        if (obj instanceof triangle) {    
            triangle t = (triangle) obj; 
            return this.lado1 == t.lado1 && this.lado2 == t.lado2 && this.lado3 == t.lado3 && this.color.equals(t.color);
        }
        return false;
    }

}