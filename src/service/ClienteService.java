package service;

import repository.ClienteRepository;
import model.Cliente;

import java.util.List;
import java.util.UUID;

public class ClienteService {

    private ClienteRepository clienteRepository = new ClienteRepository();

    public void cadastrar(String nome, String email, char tipoPessoa) {
        String id = String.valueOf(UUID.randomUUID());

        // Não aceita nome em branco.
        if (nome.isBlank()) {
            throw new RuntimeException("O campo nome não pode estar vazio.");
        }

        // Não aceita email em branco e nem sem arroba.
        if (email.isBlank() && !email.contains("@")) {
            throw new RuntimeException("O campo email não está preechido corretamente.");
        }
        // Valida tipo de pessoa
        if (tipoPessoa != 'F' && tipoPessoa != 'J') {
            throw new RuntimeException("Tipo de pessoa deve ser Fisica ou Juridica.");
        }

        Cliente cliente = new Cliente(id, nome, email, tipoPessoa);

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
