
package hospital;

import java.util.Objects;

    public class Funcionario extends Pessoa {
    private int matricula;
    private String senha;   
    
public void setMatricula(int matricula){
    if (!Objects.isNull(matricula)){
        this.matricula= matricula;
    }
}
    
public int getMatricula(){
    return this.matricula;
}

public void setSenha(String senha){
    if (senha!=""){
        this.senha = senha;
    }
}   
 
public String getSenha(){
    return this.senha;
}

}