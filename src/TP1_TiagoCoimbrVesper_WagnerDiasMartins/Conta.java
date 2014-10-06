package TP1_TiagoCoimbrVesper_WagnerDiasMartins;

public class Conta {
	private int numero;
	private String proprietario;
	private float saldo;
	
	public Conta(int numero, String proprietario, float saldo) {
        if(numero < 0) {
            throw new ExcecaoNumeroInvalido("O numero da conta não pode ser negativo.");
        }
        if(saldo < 0){
            throw new ExcecaoValorNegativo("O saldo inicial não pode ser negativo.");
        }
		this.numero = numero;
		this.proprietario = proprietario;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}

    public float getSaldo() {
        return saldo;
    }

    public String listarDados() {
        return "\n Numero da conta: " + numero +
                "\n Proprietario: " + proprietario +
                "\n Saldo: " + saldo +
                "\n ";
    }

    public void sacar(float valor) {
        if(valor < 0){
            throw new ExcecaoValorNegativo("O valor de saque não pode ser negativo.");
        }
        if(this.saldo < valor){
            throw new ExcecaoSaldoInsuficiente("Saldo insuficiente para saque.");
        }
        this.saldo -= valor;
    }

    public void depositar(float valor) {
        if(valor < 0){
            throw new ExcecaoValorNegativo("O valor de deposito não pode ser negativo.");
        }
        this.saldo += valor;
    }
	
	public String getProprietario() {
		return proprietario;
	}
	
}
