
package hospital;



import java.util.ArrayList;
import java.util.Objects;



public class Hospital extends Funcionario {
    private int IdHospital;
    private String Endereco;
    ArrayList<String> funcionario = new ArrayList<String> ();
    
     
    
    public void setIdHospital(int IdHospital){
        if (!Objects.isNull(IdHospital)){
            this.IdHospital = IdHospital;
            
        }
    }    
    
    
    
        public int getIdHospital(){
        return this.IdHospital;
        
        }  
    
        
        
    public void setEndereco(String Endereco){
        if (!"".equals(Endereco)){
           this.Endereco = Endereco; 
           
        }
    }    
    
    
    
        public String getEndereco(){
        return this.Endereco;
        
    } 
        
      
            
         public Hospital( int idHospital){
            
            this.IdHospital = IdHospital;
        
        }

                    
            
}
