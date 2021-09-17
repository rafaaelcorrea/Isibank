package br.com.isidrocorp2.isibank.model;


// IMPORTA A FUNCIONALIDADE DE LER A DATA LOCAL
import java.time.LocalDate;

// IMPORTA OS DADOS DA JPS 
import javax.persistence.*;

/*  INFORMAMOS AO JPA QUE A CLASSE CORRESPONDE 
 * A TABLEA DO  BANCOS DE DADOS. */
@Entity
@Table(name="clientes")



public class Cliente {
	
	/* COLOCAMOS ESSA CONFIGURAÇÃO POIS A COLUNA CÓDIGO NA TEBAL
	DO BANCO DE DADOS ESTÁ COMO AUTOINCREMENT*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codigo")
	private int codigo ;
	
	@Column(name="nome", length = 30)
	private String nome;
	
	@Column(name="email" , length = 60)
	private String email;
	
	@Column(name="tel" , length = 11)
	private String tel;
	
	@Column(name="data_nasc")
	private LocalDate data_nasc;
	
	@Column(name="cpf" , unique = true )
	private int cpf ;
	
	
	
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public LocalDate getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(LocalDate data_nasc) {
		this.data_nasc = data_nasc;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
	
	
}


