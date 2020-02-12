
package hospital;

public class Enfermeiro extends Funcionario {
    private String coren;
    
    public void setCoren(String coren){
        if (coren!=""){
            this.coren = coren;
        }
    }
    
    public String getCoren(){
        return this.coren;
    }
    
    
    
    
}
