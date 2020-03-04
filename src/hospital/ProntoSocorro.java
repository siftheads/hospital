
package hospital;

import java.util.Objects;


public class ProntoSocorro{
    private Hospital matriz;
    private int IdFilial;
    private String Endereco;
    
    
    
    public void setMatriz(Hospital matriz){
    this.matriz = matriz;
    
    }
    
    
    
    public Hospital getMatriz(){
        return matriz;
        
    }
 
    
    
    public void setIdFilial(int IdFilial){
        if (!Objects.isNull(IdFilial)){
            this.IdFilial = IdFilial;
            
        }
    }    
    
    
    
        public int getIdFilial(){
        return this.IdFilial;
        
        }  
        
        
        
        
    public void setEndereco(String Endereco){
        if (!"".equals(Endereco)){
           this.Endereco = Endereco; 
           
        }
    }    
    
    
    
        public String getEndereco(){
        return this.Endereco;
        
    } 
        
        
        
       ProntoSocorro(Hospital matriz, int idFilial){
            this.matriz = matriz;
            this.IdFilial = idFilial;
        
        }

        
     
}         
    


