class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;

	public void setNome(String nome) { this.nome = nome; }

	public void setSalario(double salario){
		this.salario = salario;
	}

	public double getBonus(){
		return this.salario * 0.2;
	}

	public double getBonificacao() {
		return this.salario * 0.10;
	}



}


class Gerente extends Funcionario {
	private int senha;
	private int numeroDeFuncionariosGerenciados;

	public boolean autentica(int senha){
		if (this.senha == senha){
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public void setSenha(int senha){
		this.senha = senha;
	}

	
	public double getBonus() {
		return this.salario * 0.3;
	}

	public double getBonificacao() {
		return this.salario * 0.15;
	}

}


class Desenvolvedor extends Funcionario {

	public double getBonus(){
		return this.salario * 0.25;
	}

}


class TotalizadorDeBonus {
	private double total = 0;

	public void adiciona(double valor){
		total += valor;
	}

	public double getTotal(){
		return this.total;
	}

}

class TestaFuncionario {
	public static void main(String[] args){
		Funcionario joao = new Funcionario();
		joao.setSalario(1000.0);
		System.out.println(joao.getBonus());
	
		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.0);
		System.out.println(joaquim.getBonus());
		
	
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joao.getBonus());
		totalizador.adiciona(joaquim.getBonus());

		System.out.println(totalizador.getTotal());

	} 

}

class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		gerente.setNome("João da Silva");

		gerente.setSenha(4321);

		gerente.setSalario(5000.0);
		System.out.println(gerente.getBonificacao());

	}
}

