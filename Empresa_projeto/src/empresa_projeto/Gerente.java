
package empresa_projeto;
import java.util.ArrayList;
import java.util.Scanner;

public class Gerente extends Funcionário {
       private ArrayList<Projeto>listaP = new ArrayList<Projeto>(); //vetor que guarda os projetos do gerente
       Scanner entrada = new Scanner(System.in);
       
	public void imprimir_Projeto() {
            System.out.printf("Projetos:\n");
               for(Projeto x : listaP){
                 System.out.printf("\nTítulo:%s\n",x.getTitulo());
                 System.out.printf("\nAtividades a serem desenvolvidas:%s\n",x.getAtividades_a_serem_desenvolvidas());
                 System.out.printf("\nData de início:%s\n",x.getData_de_inicio());
                 System.out.printf("\nData de finalização%s\n",x.getData_de_finalizacao());
                 System.out.printf("\nHistórico:%s\n",x.getHistorico());
                 System.out.printf("\nProdutos entregues:%s\n",x.getProdutos_entregues());
                 System.out.printf("\nStakeholders:%s\n",x.getStakeholders());
	}
        }

	public void inserir_projeto() {
            Projeto pro=new Projeto();
            
            System.out.printf("Título:\n");
            pro.setTitulo(entrada.nextLine());
    
            System.out.printf("Data de início:\n");
            pro.setData_de_inicio(entrada.nextLine());
    
            System.out.printf("Data de finalização:\n");
            pro.setData_de_finalizacao(entrada.nextLine());
            
            System.out.printf("Atividades a serem desenvolvidas:\n");
            pro.setAtividades_a_serem_desenvolvidas(entrada.nextLine());
            
            System.out.printf("Stakeholders:\n");
            pro.setStakeholders(entrada.nextLine());
            
            System.out.printf("Histórico:\n");
            pro.setHistorico(entrada.nextLine());
            
            System.out.printf("Data de início:\n");
            pro.setData_de_inicio(entrada.nextLine());
            
            System.out.printf("Produtos entregues:\n");
            pro.setProdutos_entregues(entrada.nextLine());
            
            pro.codigo=this.codigo;
            
            pro.gerente=this.getNome();
            
            listaP.add(pro);
	}
        
        public Projeto getProjeto(){
            return listaP.get(0);
        }
    
   

}
