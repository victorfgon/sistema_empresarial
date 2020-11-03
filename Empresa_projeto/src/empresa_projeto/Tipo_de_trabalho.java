package empresa_projeto;
import java.util.ArrayList;
import java.util.Scanner;

public class Tipo_de_trabalho {
    Scanner entrada = new Scanner(System.in);
    
	public int codigo;
	private String caracteristicas;
	private ArrayList<Operário>operarios = new ArrayList<Operário>();//vetor que guarda os operários do projeto
	private String periodo;
	
	public int getCódigo() {
		return codigo;
	}
	public int setCódigo(Integer código) {
		return this.codigo = código;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public String setCaracteristicas(String caracteristicas) {
		return this.caracteristicas = caracteristicas;
	}
        
	public String getPeriodo() {
		return periodo;
	}
	public String setPeriodo(String periodo) {
		return this.periodo = periodo;
	}
        
        public Tipo_de_trabalho criar_tipo_de_trabalho(Tipo_de_trabalho tip){  
         
         System.out.printf("Características:\n");
         tip.setCaracteristicas(entrada.nextLine());
         
         System.out.printf("Período:\n");
         tip.setPeriodo(entrada.nextLine());
        
         
         
         return tip;
        }
        
        public void imprimir_tipo_de_trabalho(){
           System.out.printf("\nCódigo:%d\n",this.codigo);
           System.out.printf("Características:%s\n",this.caracteristicas);
           System.out.printf("Período:%s\n",this.periodo);
           System.out.printf("\nOperários:\n");
           for(Operário x : operarios){
           System.out.printf("%s\n",x.getNome());
           }
           System.out.printf("===================\n");
        }
        
       

    void guardar_operario(Operário ope) {
       operarios.add(ope);
    }
        
       
}
