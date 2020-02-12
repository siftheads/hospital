
package hospital;

import java.util.Objects;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private int idade;
 
    
public void setNome(String nome){
    if (!"".equals(nome)){
        this.nome = nome;
    }
    else{} 
}
 
public String getNome(){
    return this.nome;
}

public void setCpf(String cpf){
    if (cpf!=""){
        this.cpf = cpf;
    }
    else{}    
}

public String getCpf(){
    return this.cpf;
}

public void setRg(String rg){
    if (rg!=""){
        this.rg = rg;
    }
    else{}
}

public String getRg(){
    return this.rg;
}

public void setIdade(int idade){
    if (!Objects.isNull(idade)){
        this.idade = idade;
    }
    else{}
}

public int getIdade(){
    return this.idade;
}

}