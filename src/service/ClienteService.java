package service;

import Repository.ClienteRepository;
import model.Cliente;

import java.util.List;
import java.util.UUID;

public class ClienteService {

    private ClienteRepository clienteRepository = new ClienteRepository();

    public void cadastrar(String name, String email, char tipoPessoa ) {
        String id = String.valueOf(UUID.randomUUID());
        Cliente cliente = new Cliente(id, name, email, tipoPessoa);

        clienteRepository.salvar(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.listar();
    }

    public Cliente busca(String id) {
        return clienteRepository.buscarPorId(id);
    }

    public void deletarCliente(String id) {
        clienteRepository.deletar(id);
    }
}
