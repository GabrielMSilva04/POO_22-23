package aula07.ex01;

public class rectangle extends Forma{
    private double comprimento;
    private double altura;
    private String color;

    public rectangle(double comprimento, double altura, String color){
        setComprimento(comprimento);
        setAltura(altura);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getComprimento(){
        return comprimento;
    }

    public double getAltura(){
        return altura;
    }

    public double setComprimento(double comprimento){
        if (comprimento > 0){
            this.comprimento = comprimento;
        }
        return comprimento;
    }

    public double setAltura(double altura){
        if (altura > 0){
            this.altura = altura;
        }
        return comprimento;
    }

    public double getArea() {
        return comprimento*altura;
    }

    public double getPerimeter() {
        return 2*(comprimento+altura);
    }

    public String toString() {
        return "Tipo: Retângulo"+"\nComprimento: "+comprimento+"\nAltura: "+altura+"\nPerímetro: "+getPerimeter()+"\nArea: "+getArea()+"\nCor: "+getColor();
    }

    public boolean equals(Object obj) {
        if (obj instanceof rectangle) {    
            rectangle r = (rectangle) obj; 
            return this.comprimento == r.comprimento && this.altura == r.altura && this.color.equals(r.color);
        }
        return false;
    }

}