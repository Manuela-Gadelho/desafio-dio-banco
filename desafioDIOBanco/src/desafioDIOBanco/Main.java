package desafioDIOBanco;

public class Main {

	public static void main(String[] args) {

		
		Cliente manu = new Cliente();
		manu.setNome("manu");
		Conta cc = new ContaCorrente(manu);
		cc.depositar(100);
		Conta cp = new ContaPoupanca(manu);
		cc.tranferir(100, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
