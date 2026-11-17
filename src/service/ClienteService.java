package service;

import Repository.ClienteRepository;
import model.Cliente;

import java.util.List;

public class ClienteService {

    private ClienteRepository clienteRepository = new ClienteRepository();

    public void cadastrar(String name, String email, char tipoPessoa ) {
        Cliente cliente = new Cliente(name, email, tipoPessoa);

        clienteRepository.salvar(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.listar();
    }

}
