package br.com.isidrocorp2.isibank.model;

// IMPORTAÇÃO DO TIPO DO TIPO DE DADI DATA
import java.time.LocalDate;

// IMPORTAÇÃO DOS PERSISTENCES

// IMP. DOS COLUMNS
import javax.persistence.Column;

// IMP DOS ENTITYS
import javax.persistence.Entity;

// IMP DOS IDS
import javax.persistence.Id;

// IMPORTAÇÃO DOS JOINCOLUMNS

import javax.persistence.JoinColumn;

// IMPORTAÇÃO DOS MANYSTONE

import javax.persistence.ManyToOne;

// IMPORETAÇÃO DOS TABLES
import javax.persistence.Table;

@Entity
@Table(name = "contas_bancarias")
public class Conta {

	@Id
	@Column(name = "numero_conta")
	private int numero_conta;

	@Column(name = "digito_verifi")
	private int digito_verifi;

	@Column(name = "num_agencia")
	private int num_agencia;

	@Column(name = "saldo")
	private double saldo;

	@Column(name = "tipo_conta")
	private int tipo_conta;

	@Column(name = "data_abertura")
	private LocalDate data_abertura;

	@ManyToOne
	@JoinColumn(name = "cod_cliente")
	private Cliente titular;

	public int getNumero_conta() {
		return numero_conta;
	}

	public void setConta(int numero_conta) {
		this.numero_conta = numero_conta;
	}

	public int getDigito_verifi() {
		return digito_verifi;
	}

	public void setDigito_verifi(int digito_verifi) {
		this.digito_verifi = digito_verifi;
	}

	public int getNum_agencia() {
		return num_agencia;
	}

	public void setNum_agencia(int num_agencia) {
		this.num_agencia = num_agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getTipo_conta() {
		return tipo_conta;
	}

	public void setTipo_conta(int tipo_conta) {
		this.tipo_conta = tipo_conta;
	}

	public LocalDate getData_abertura() {
		return data_abertura;
	}

	public void setData_abertura(LocalDate data_abertura) {
		this.data_abertura = data_abertura;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
