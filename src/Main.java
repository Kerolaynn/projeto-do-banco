import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		ArrayList<Conta> lstContas = new ArrayList<>();
		banco.setNome("banco Teste");

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Cliente kerolaynn = new Cliente();
		kerolaynn.setNome("Kerolaynn");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		Conta ccKero = new ContaCorrente(kerolaynn);
		Conta poupancaKero = new ContaPoupanca(kerolaynn);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		ccKero.depositar(300);
		ccKero.transferir(400, poupanca);
		ccKero.imprimirExtrato();
		poupancaKero.imprimirExtrato();


		lstContas.add(cc);
		lstContas.add(poupanca);
		lstContas.add(ccKero);
		lstContas.add(poupancaKero);
		banco.setContas(lstContas);

		banco.imprimeAllClients();
	}

}
