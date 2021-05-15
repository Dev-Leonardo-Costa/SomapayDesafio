package resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmpresaResource {
	
	@JsonProperty("nome_empresa")
	private String nome;
	
	@JsonProperty("id_empresa")
	private Long id;
	
	public EmpresaResource(String nome, Long id) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
