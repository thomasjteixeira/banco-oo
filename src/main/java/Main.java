
public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Thomas");

		Conta cc1 = new ContaCorrente(c1);
		Conta poupanca1 = new ContaPoupanca(c1);

		cc1.depositar(100);
		cc1.transferir(100, poupanca1);

		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();

		Cliente c2 = new Cliente();
		c2.setNome("Jefferson");

		Conta cc2 = new ContaCorrente(c2);
		Conta poupanca2 = new ContaPoupanca(c2);

		cc2.depositar(500);
		cc2.transferir(100, poupanca2);

		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();


	}

}