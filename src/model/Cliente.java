package model;

public class Cliente {
    private final String id;
    private String nome;
    private String email;
    private char tipoPessoa;

    public Cliente(String id, String nome, String email, char tipoPessoa) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.tipoPessoa = tipoPessoa;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", tipoPessoa=" + tipoPessoa +
                '}';
    }
}
