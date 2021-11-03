public class TesteCarro {
    public static void main(String[] args){

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        System.out.println("A autonomia do carro é : " + van.obterAutonomia());


        double qtdCombustivel50 = van.calcularCombustivel(50);
        double qtdCombustivel60 = van.calcularCombustivel(60);

        System.out.println("qtdCombustivel50 = " + qtdCombustivel50);
        System.out.println("qtdCombustivel60 = " + qtdCombustivel60);
    }
}
