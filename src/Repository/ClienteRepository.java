package Repository;

import db.Database;
import model.Cliente;

import java.util.List;

public class ClienteRepository {
    public void salvar(Cliente cliente){

        try {
            Database.clientes.add(cliente);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Cliente> listar(){
        return Database.clientes;
    }
}
