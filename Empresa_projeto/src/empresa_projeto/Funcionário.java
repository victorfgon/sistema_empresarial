package empresa_projeto;
import java.util.Scanner;


public class Funcionário {
    Scanner entrada=new Scanner(System.in);
    private String nome;
    public int codigo;
    private String filiacao;
    private String carga_horaria;
    private String comissao;
    private String cargo;
    private String telefone;
    private String endereco;
    private String salario;
    private String departamento;

public void inserir_funcionario(){
    
    System.out.printf("Nome:\n");
    this.nome=entrada.nextLine();
    
    System.out.printf("FiliaÃ§Ã£o:\n");
    this.filiacao=entrada.nextLine();
 
    System.out.printf("Carga horÃ¡ria:\n");
    this.carga_horaria=entrada.nextLine();
    
    System.out.printf("ComissÃ£o:\n");
    this.comissao=entrada.nextLine();
    
    System.out.printf("Cargo:\n");
    this.cargo=entrada.nextLine();
    
    System.out.printf("Telefone:\n");
    this.telefone=entrada.nextLine();
    
    System.out.printf("EndereÃ§o:\n");
    this.endereco=entrada.nextLine();
    
    System.out.printf("SalÃ¡rio:\n");
    this.salario=entrada.nextLine();
    
    System.out.printf("Departamento:\n");
    this.departamento=entrada.nextLine();
   
    
}

public String getNome(){
    return this.nome;
}

public void imprimir_funcionario(){
    System.out.printf("Nome:%s\n",this.nome);
    System.out.printf("Filiação:%s\n",this.filiacao);
    System.out.printf("Carga horária:%s\n",this.carga_horaria);
    System.out.printf("Comissão:%s\n",this.comissao);
    System.out.printf("Cargo:%s\n",this.cargo);
    System.out.printf("Telefone:%s\n",this.telefone);
    System.out.printf("Endereço:%s\n",this.endereco);
    System.out.printf("Salário:%s\n",this.salario);
    System.out.printf("Departamento:%s\n",this.departamento);
}

public void inserir_dependente(Dependente dep){
    System.out.printf("Nome:\n");
    dep.setNome(entrada.nextLine());
    
    System.out.printf("Sexo:\n");
    dep.setSexo(entrada.nextLine());
    
    System.out.printf("Data de nascimento:\n");
    dep.setData_de_nascimento(entrada.nextLine());
}

public void imprimir_dependente(Dependente dep){
    System.out.printf("\nNome:%s\n",dep.getNome());
    System.out.printf("\nSexo:%s\n",dep.getSexo());
    System.out.printf("\nData de nascimento:%s\n",dep.getData_de_nascimento());
}
}