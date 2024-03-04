// Classe que representa um carro
public class Carro {
    private String placa;
    private String modelo;
    private String cor;

    // Construtor
    public Carro(String placa, String modelo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }

    // Método para obter a placa do carro
    public String getPlaca() {
        return placa;
    }

    // Método para exibir informações do carro
    public void exibirInfo() {
        System.out.println("Placa: " + placa + ", Modelo: " + modelo + ", Cor: " + cor);
    }
}
