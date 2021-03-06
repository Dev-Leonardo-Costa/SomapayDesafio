package datasource.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Empresa")
public class Empresa implements Serializable{
	
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idEmpresa;
	

	private String Fantasia;
	private Long CNPJ;
	private String Logradouro;
	private String Complemento;
	private Long Cep;
	private int Número;
	private String uf;
	private String Bairro;
	private String Email;
	
	public Empresa(Long idEmpresa, String fantasia, Long cNPJ, String logradouro, String complemento, Long cep,
			int número, String uf, String bairro, String email) {
		super();
		this.idEmpresa = idEmpresa;
		Fantasia = fantasia;
		CNPJ = cNPJ;
		Logradouro = logradouro;
		Complemento = complemento;
		Cep = cep;
		Número = número;
		this.uf = uf;
		Bairro = bairro;
		Email = email;
	}

	public long getIdEmpresa() {
		return idEmpresa;
	}



	public void setIdEmpresa(long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}



	public String getFantasia() {
		return Fantasia;
	}



	public void setFantasia(String fantasia) {
		Fantasia = fantasia;
	}



	public Long getCNPJ() {
		return CNPJ;
	}



	public void setCNPJ(Long cNPJ) {
		CNPJ = cNPJ;
	}



	public String getLogradouro() {
		return Logradouro;
	}



	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}



	public String getComplemento() {
		return Complemento;
	}



	public void setComplemento(String complemento) {
		Complemento = complemento;
	}



	public Long getCep() {
		return Cep;
	}



	public void setCep(Long cep) {
		Cep = cep;
	}



	public int getNúmero() {
		return Número;
	}



	public void setNúmero(int número) {
		Número = número;
	}



	public String getUf() {
		return uf;
	}



	public void setUf(String uf) {
		this.uf = uf;
	}



	public String getBairro() {
		return Bairro;
	}



	public void setBairro(String bairro) {
		Bairro = bairro;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idEmpresa ^ (idEmpresa >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (idEmpresa != other.idEmpresa)
			return false;
		return true;
	}
}
