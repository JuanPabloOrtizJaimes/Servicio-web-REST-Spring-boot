/**
 * 
 */
package com.mltutoriales.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Juan OJ
 *
 */
@Entity
@Table(name="EMPLEADO")
public class EmpleadoEntity {
	
	@Id
	@Column(name="codigo")
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="salario")
	private Long salario;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getSalario() {
		return salario;
	}

	public void setSalario(Long salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "EmpleadoEntity [codigo=" + codigo + ", nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	
}

