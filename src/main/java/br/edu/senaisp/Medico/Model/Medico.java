package br.edu.senaisp.Medico.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="medico")
public class Medico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotBlank
    @Size(min=2, max=120)
    private String nome;
    
    @OneToMany
    private List<Especialidade> especialidade=new ArrayList<Especialidade>();
    
    @NotBlank
    @Size(min=2, max=120)
    private String crm;
    
    public Medico() {
		// TODO Auto-generated constructor stub
	}

	public Medico(Integer id, @NotBlank @Size(min = 2, max = 120) String nome,
			@NotBlank @Size(min = 2, max = 120) String crm) {
		super();
		this.id = id;
		this.nome = nome;
		this.crm = crm;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
 
	
	
    
    
    
    
    
}