
package hospital;

public class Principal {

    public static void main(String[] args) {
       Paciente p = new Paciente();
       p.setCodpaciente(123);
       p.setSenha(null);
       p.setNome(null);
       p.setCpf(null);
       p.setIdade(123);
       p.setRg(null);
       System.out.println("Codigo: " + p.getCodpaciente());
       System.out.println("Senha: " + p.getSenha());
       System.out.println("Nome: " + p.getNome());
       System.out.println("Cpf: " + p.getCpf());
       System.out.println("Idade: " + p.getIdade());
       System.out.println("Rg: " + p.getRg());
       
       
       Funcionario f = new Funcionario();
       f.setMatricula(123);
       f.setSenha(null);
       f.setNome(null);
       f.setCpf(null);
       f.setIdade(123);
       f.setRg(null);
       System.out.println("Matricula: " + f.getMatricula());
       System.out.println("Senha: " + f.getSenha());
       System.out.println("Nome: " + f.getNome());
       System.out.println("Cpf: " + f.getCpf());
       System.out.println("Idade: " + f.getIdade());
       System.out.println("Rg: " + f.getRg());
       
       
       Enfermeiro e = new Enfermeiro();
       e.setCoren(null);
       e.setSenha(null);
       e.setNome(null);
       e.setCpf(null);
       e.setIdade(123);
       e.setRg(null);
       System.out.println("Coren: " + e.getCoren());
       System.out.println("Senha: " + e.getSenha());
       System.out.println("Nome: " + e.getNome());
       System.out.println("Cpf: " + e.getCpf());
       System.out.println("Idade: " + e.getIdade());
       System.out.println("Rg: " + e.getRg());
       
       
       Medico m = new Medico();
       m.setCrm(null);
       m.setEspecialidade(null);
       m.setSenha(null);
       m.setNome(null);
       m.setCpf(null);
       m.setIdade(123);
       m.setRg(null);
       System.out.println("Crm: " + m.getCrm());
       System.out.println("Especialidade: " + m.getEspecialidade());
       System.out.println("Senha: " + m.getSenha());
       System.out.println("Nome: " + m.getNome());
       System.out.println("Cpf: " + m.getCpf());
       System.out.println("Idade: " + m.getIdade());
       System.out.println("Rg: " + m.getRg());
       
       
    }
    
}
