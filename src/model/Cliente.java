package model;

public class Cliente {
    private String id;
    private String name;
    private char tipoPessoa;

    public Cliente(String name, char tipoPessoa) {
        this.name = name;
        this.tipoPessoa = tipoPessoa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(char tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
