import POO.model.Cliente;
import POO.model.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "0000000";
        //dados do endereço

        Cliente cliente = new Cliente();
        cliente.
        //dados do cliente

        cliente.adicionaEndereco(endereco);
        System.out.println("Endereço adicionado com sucesso!");

    }
}
