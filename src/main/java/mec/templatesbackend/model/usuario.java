package mec.templatesbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="usuario")
public class usuario {
@Id
public Integer Codigo;
@Column(nullable = false,length = 50)
public String Nome;
@Column(nullable = false,length = 10)
public String Loguin;
@Column(nullable = false,length = 10)
public String Senha;

public Integer getCodigo() {
    return Codigo;
}

public void setCodigo(Integer codigo) {
    Codigo = codigo;
}

public String getNome() {
    return Nome;
}

public void setNome(String nome) {
    Nome = nome;
}

public String getLoguin() {
    return Loguin;
}

public void setLoguin(String loguin) {
    Loguin = loguin;
}

public String getSenha() {
    return Senha;
}

public void setSenha(String senha) {
    Senha = senha;
}
}
