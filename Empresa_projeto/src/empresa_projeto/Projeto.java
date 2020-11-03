package empresa_projeto;
public class Projeto {

	public int codigo;
        public  String gerente;
        private String titulo;
	private String data_de_inicio;
	private String data_de_finalizacao;
	private String atividades_a_serem_desenvolvidas;
	private String stakeholders;
	private String historico;
	private String produtos_entregues;

	public String getTitulo() {
		return titulo;
	}

	public String setTitulo(String titulo) {
		return this.titulo = titulo;
	}

	public String getData_de_inicio() {
		return data_de_inicio;
	}

	public String setData_de_inicio(String data_de_inicio) {
		return this.data_de_inicio = data_de_inicio;
	}

	public String getData_de_finalizacao() {
		return data_de_finalizacao;
	}

	public String setData_de_finalizacao(String data_de_finalizacao) {
		return this.data_de_finalizacao = data_de_finalizacao;
	}

	public String getAtividades_a_serem_desenvolvidas() {
		return atividades_a_serem_desenvolvidas;
	}

	public String setAtividades_a_serem_desenvolvidas(String atividades_a_serem_desenvolvidas) {
		return this.atividades_a_serem_desenvolvidas = atividades_a_serem_desenvolvidas;
	}

	public String getStakeholders() {
		return stakeholders;
	}

	public String setStakeholders(String stakeholders) {
		return this.stakeholders = stakeholders;
	}

	public String getHistorico() {
		return historico;
	}

	public String setHistorico(String historico) {
		return this.historico = historico;
	}

	public String getProdutos_entregues() {
		return produtos_entregues;
	}

	public String setProdutos_entregues(String produtos_entregues) {
		return this.produtos_entregues = produtos_entregues;
	}

	public void imprimir_Gerente() {
		System.out.printf("Gerente do projeto:%s\n",this.gerente);
	}

}
