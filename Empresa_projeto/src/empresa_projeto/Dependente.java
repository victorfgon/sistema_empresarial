
package empresa_projeto;

public class Dependente {
    private String nome;
    private String sexo;
    private String data_de_nascimento;
    public int codigo;
    

	public String setNome(String nome) {
		return this.nome = nome;
	}
        
        public String getNome() {
		return this.nome;
	}
        
        public String setSexo(String sexo) {
		return this.sexo = sexo;
	}
        
        public String getSexo() {
		return this.sexo;
	}
        
        public String setData_de_nascimento(String data) {
		return this.data_de_nascimento = data;
	}
        
        public String getData_de_nascimento() {
		return this.data_de_nascimento;
	}
}

