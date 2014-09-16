package trabalho;

public class Conta {
	private int numero;
	private String proprietario;
	private float saldo;
	
	public Conta(int numero, String proprietario, float saldo) {
		this.numero = numero;
		this.proprietario = proprietario;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getProprietario() {
		return proprietario;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public String listarDados() {
		return "\nNumero da conta: " + numero +
			   "\nProprietario: " + proprietario +
			   "\nSaldo: " + saldo;
	}
	
	public void depositar(float valor) {
		this.saldo += valor;
	}
	
	public void sacar(float valor) {
		this.saldo -= valor;
	}
}
