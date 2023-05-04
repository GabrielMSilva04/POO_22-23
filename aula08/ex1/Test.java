package aula08.ex1;

public class Test {
    public static void main(String[] args) {
        EmpresaAluguer ea = new EmpresaAluguer("empresaaluguer", "3800-007", "empresaaluguer@gmail.com");
        ea.addVeiculo(new AutomóvelLigeiro("12-34-AB", "Mercedes", "Actros", 500, 0, 1234, 10000));
        ea.addVeiculo(new AutomóvelLigeiro("32-54-HN", "Porsche", "Turbo", 700, 600, 4321, 1000));

        ea.listVeiculos();
        System.out.println(ea.maiorQuilometros());
    }
    
    
}
