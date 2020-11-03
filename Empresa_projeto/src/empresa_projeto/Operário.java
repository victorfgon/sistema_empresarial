
package empresa_projeto;
import java.util.ArrayList;

public class Operário extends Funcionário {
	private String habilidades;
        private ArrayList<Tipo_de_trabalho>tipos_de_trabalho = new ArrayList<Tipo_de_trabalho>();//vetor que guarda os tipos de trabalho do operário
	

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}
        
   

    void inserir_tipo_de_trabalho(Tipo_de_trabalho tip) {
        tipos_de_trabalho.add(tip);
    }
    
    void imprimir_tipo_de_trabalho(){
        System.out.printf("Operário:%s\n",this.getNome());
        System.out.printf("Habilidades:%s\n",this.habilidades);
        System.out.printf("\nTipos de trabalho:\n");
        
       for(Tipo_de_trabalho x : tipos_de_trabalho){
        System.out.printf("===================\n");
        System.out.printf("Código:%d\n",x.getCódigo());
        System.out.printf("Características:%s\n",x.getCaracteristicas());
        System.out.printf("Período:%s\n",x.getPeriodo());
        }
    }

}
