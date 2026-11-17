package model;

public class Cliente {
    private String id;
    private String name;
    private String email;
    private char tipoPessoa;

    public Cliente(String id, String name, String email,char tipoPessoa) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(char tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", tipoPessoa=" + tipoPessoa +
                '}';
    }
}
