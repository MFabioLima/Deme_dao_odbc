package model.entidadades;

import java.io.Serializable;
import java.util.Date;

public class Vendedor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String noome;
	private String email;
	private Date birthData;
	private Double salario;
	private Departamento departamento;

	public Vendedor() {
	}

	public Vendedor(Integer id, String noome, String email, Date birthData, Double salario, Departamento departamento) {
		this.id = id;
		this.noome = noome;
		this.email = email;
		this.birthData = birthData;
		this.salario = salario;
		this.departamento = departamento;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNoome() {
		return noome;
	}

	public void setNoome(String noome) {
		this.noome = noome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthData() {
		return birthData;
	}

	public void setBirthData(Date birthData) {
		this.birthData = birthData;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Vendedor other = (Vendedor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vendedor [id=" + id + ", noome=" + noome + ", email=" + email + ", birthData=" + birthData
				+ ", salario=" + salario + ", departamento=" + departamento + "]";
	}	
}
