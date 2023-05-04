package aula07.ex01;

public abstract class Forma implements interfaceForma {
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getColor();
}

interface interfaceForma {
    public double getArea();
    public double getPerimeter();
    public String getColor();
    public void setColor(String color);
    
}
