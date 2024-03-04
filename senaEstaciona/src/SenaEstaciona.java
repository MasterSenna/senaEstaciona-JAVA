import java.util.ArrayList;

// Classe que representa o estacionamento
public class SenaEstaciona {
    private ArrayList<Carro> carrosEstacionados; // Lista de carros estacionados

    // Construtor
    public SenaEstaciona() {
        carrosEstacionados = new ArrayList<>();
    }

    // Método para adicionar carro ao estacionamento
    public void estacionarCarro(Carro carro) {
        carrosEstacionados.add(carro);
        System.out.println("Carro estacionado com sucesso!");
    }

    // Método para remover carro do estacionamento
    public void retirarCarro(String placa) {
        for (Carro carro : carrosEstacionados) {
            if (carro.getPlaca().equals(placa)) {
                carrosEstacionados.remove(carro);
                System.out.println("Carro removido do estacionamento.");
                return;
            }
        }
        System.out.println("Carro com placa " + placa + " não encontrado no estacionamento.");
    }

    // Método para listar carros estacionados
    public void listarCarrosEstacionados() {
        System.out.println("Carros estacionados:");
        for (Carro carro : carrosEstacionados) {
            carro.exibirInfo();
        }
    }

    // Método principal
    public static void main(String[] args) {
        SenaEstaciona estacionamento = new SenaEstaciona(); // Instanciação do estacionamento

        // Criando alguns carros
        Carro carro1 = new Carro("ABC1234", "Fiat Uno", "Vermelho");
        Carro carro2 = new Carro("XYZ5678", "VW Gol", "Preto");

        // Estacionando carros
        estacionamento.estacionarCarro(carro1);
        estacionamento.estacionarCarro(carro2);

        // Listando carros estacionados
        estacionamento.listarCarrosEstacionados();

        // Removendo carro do estacionamento
        estacionamento.retirarCarro("ABC1234");

        // Listando carros estacionados após a remoção
        estacionamento.listarCarrosEstacionados();
    }
}
