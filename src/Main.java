
public class Main {

	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas");
		lucas.setCpf(Cliente.cpfFormatado("10987654321"));
		Conta cc = new ContaCorrente(lucas);
		Conta poupanca = new ContaPoupanca(lucas);

		cc.depositar(10000);
		cc.transferir(1200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
