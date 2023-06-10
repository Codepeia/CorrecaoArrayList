
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Curso curso;
        ArrayList<Curso> cursos = new ArrayList<>();
        
        Aluno aluno = new Aluno();
        ArrayList<Double> notas = new ArrayList<>();
        
        Telefone telefone;
        ArrayList<Telefone> telefones = new ArrayList<>();
        
        Professor novoProf = new Professor();
        
        Endereco endereco;
        
        //Cadastro do professor:
        System.out.println("___CADASTRO DO PROFESSOR___");
        
        System.out.println("Digite o nome");
        novoProf.setNome(scan.nextLine());
        System.out.println("Digite o e-mail");
        novoProf.setEmail(scan.nextLine());
        System.out.println("Digite o cpf");
        novoProf.setCpf(scan.nextLine());
        
        endereco = new Endereco();
        System.out.println("Digite a rua");
        endereco.setRua(scan.nextLine());
        System.out.println("Digite a cidade");
        endereco.setCidade(scan.nextLine());
        System.out.println("Digite o estado");
        endereco.setEstado(scan.nextLine());
        
        novoProf.setEndereco(endereco);
        
        System.out.println("Digite os telefones - maximo 2");
        for(int i = 0; i < 2; i++ ){
           telefone = new Telefone(); 
            System.out.println("Digite o tipo");
            telefone.setTipo(scan.nextLine());
            System.out.println("Digite o numero");
            telefone.setNumero(scan.nextLine());
            System.out.println("Digite o ddd");
            telefone.setDdd(scan.nextLine());
            
            telefones.add(telefone); 
        }
        novoProf.setTelefones(telefones);
        
        System.out.println("Digite a titulacao");
        novoProf.setTitulacao(scan.nextLine());
        System.out.println("Digite o salario");
        novoProf.setSalario(scan.nextDouble());
        
        System.out.println("Digite o cursos - maximo 2");
        telefones = new ArrayList<>();
        scan.nextLine();
        for(int i = 0 ; i < 2 ; i++){
            curso = new Curso();
            System.out.println("Digite o nome");
            curso.setNome(scan.nextLine());
            cursos.add(curso);
        }  
        novoProf.setCursos(cursos);
        
        
        //Cadastro do aluno:
        System.out.println("___CADASTRO DO aluno");
        System.out.println("Digite o nome");
        aluno.setNome(scan.nextLine());
        System.out.println("Digite o email");
        aluno.setEmail(scan.nextLine());
        System.out.println("Digite o cpf");
        aluno.setCpf(scan.nextLine());
        
        endereco = new Endereco();
        System.out.println("Digite a rua");
        endereco.setRua(scan.nextLine());
        System.out.println("Digite a cidade");
        endereco.setCidade(scan.nextLine());
        System.out.println("Digite o estado");
        endereco.setEstado(scan.nextLine());
        
        aluno.setEndereco(endereco);
        
        System.out.println("Digite os telefones - maximo 2");
        for(int i = 0; i < 2; i++ ){
           telefone = new Telefone(); 
            System.out.println("Digite o tipo");
            telefone.setTipo(scan.nextLine());
            System.out.println("Digite o numero");
            telefone.setNumero(scan.nextLine());
            System.out.println("Digite o ddd");
            telefone.setDdd(scan.nextLine());
            
            telefones.add(telefone); 
        }
        aluno.setTelefones(telefones);
        
        curso = new Curso();
        System.out.println("Digite o curso");
        curso.setNome(scan.nextLine());
        
        aluno.setCurso(curso);
        
        System.out.println("Digite as notas");
        for(int i = 0 ; i < 2; i++){
            notas.add(scan.nextDouble());
        } 
        
        aluno.setNotas(notas);
        
        novoProf.imprimir();
        aluno.imprimir();
        
    }
    
}
