
package hospital;

import java.util.Objects;


public class Paciente extends Pessoa{
    private int codpaciente;
    private String senha; 
    
    public void setCodpaciente(int codpaciente){
        if (!Objects.isNull(codpaciente)){
            this.codpaciente = codpaciente;
        }

    }

    public int getCodpaciente(){
        return this.codpaciente;
    }



    public void setSenha(String senha){
        if (!"".equals(senha)){
           this.senha = senha; 
        }
    }

    public String getSenha(){
        return this.senha;
    }
   
    
    
}
