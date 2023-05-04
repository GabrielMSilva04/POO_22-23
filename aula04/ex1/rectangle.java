package aula04.ex1;

public class rectangle{
    private double comprimento;
    private double altura;

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

    public rectangle(double c, double a){
        comprimento = c;
        altura = a;
    }

    public String toString() {
        return "Tipo: Retângulo"+"\nComprimento: "+comprimento+"\nAltura: "+altura+"\nPerímetro: "+getPerimeter()+"\nArea: "+getArea();
    }

    public boolean equals(Object obj) {
        if (obj instanceof rectangle) {    
            rectangle t = (rectangle) obj; 
            return this.comprimento == t.comprimento && this.altura == t.altura;
        }
        return false;
    }

}