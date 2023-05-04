package aula06.ex03;

import java.util.ArrayList;

public class Conjunto {
    private ArrayList<Integer> conjunto;

    public Conjunto() {
        conjunto = new ArrayList<>();
    }
    public static void main(String[] args) { 
        Conjunto c1 = new Conjunto(); 
        c1.insert(4); c1.insert(7); c1.insert(6); c1.insert(5); 
       
        Conjunto c2 = new Conjunto(); 
        int[] test = { 7, 3, 2, 5, 4, 6, 7}; 
        for (int el : test) c2.insert(el); 
        c2.remove(3);  c2.remove(5); c2.remove(6); 
       
        System.out.println(c1); 
        System.out.println(c2); 
           
        System.out.println("Número de elementos em c1: " + c1.size()); 
        System.out.println("Número de elementos em c2: " + c2.size()); 
        
        System.out.println("c1 contém 6?: " + ((c1.contains(6) ? "sim" : "não"))); 
        System.out.println("c2 contém 6?: " + ((c2.contains(6) ? "sim" : "não"))); 
     
        System.out.println("União:" + c1.combine(c2));     
        System.out.println("Interseção:" + c1.intersect(c2));     
        System.out.println("Diferença:" + c1.subtract(c2)); 
     
        c1.empty();  
        System.out.println("c1:" + c1); 
    } 

    public void insert(int element) {
        if (!conjunto.contains(element)) {
            conjunto.add(element);
        }
    }

    public boolean contains(int element) {
        return conjunto.contains(element);
    }

    public void remove(int element) {
        if (conjunto.contains(element)) {
            conjunto.remove(conjunto.indexOf(element));
        }
    }

    public int size() {
        return conjunto.size();
    }

    public void empty() {
        conjunto.clear();
    }

    public Conjunto combine(Conjunto c) {
        Conjunto uniao = new Conjunto();
        for (int element : conjunto) {
            uniao.insert(element);
        }
        for (int element : c.conjunto) {
            uniao.insert(element);
        }
        return uniao;
    }

    public Conjunto intersect(Conjunto c) {
        Conjunto intersecao = new Conjunto();
        for (int element : conjunto) {
            if (c.conjunto.contains(element)) {
                intersecao.insert(element);
            }
        }
        return intersecao;
    }

    public Conjunto subtract(Conjunto c) {
        Conjunto diferenca = new Conjunto();
        for (int element : conjunto) {
            if (!c.conjunto.contains(element)) {
                diferenca.insert(element);
            }
        }
        return diferenca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int element : conjunto) {
            sb.append(element).append(" ");
        }
        return sb.toString();
    }
}
