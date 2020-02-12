
package hospital;

public class Medico extends Funcionario {
    private String crm;
    private String especialidade;

    
    public void setCrm(String Cmr){
        String cmr;
        if (crm!=""){
            this.crm = crm;
        }
    }
    
      public String getCrm(){
        return this.crm;
    }
    
    
    public void setEspecialidade(String especialidade){
        if ( especialidade!=""){
            this.especialidade = especialidade;
        }
    }
    
      public String getEspecialidade(){
        return this.especialidade;
    }
    
    
}
