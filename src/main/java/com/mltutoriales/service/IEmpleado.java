/**
 * 
 */
package com.mltutoriales.service;

import java.util.List;

import com.mltutoriales.dto.EmpleadoDTO;


/**
 * @author Juan OJ
 *
 */
public interface IEmpleado {

	String holaMundo(String nombre);
	
	String guardarEmpleado(EmpleadoDTO empleadoDTO);
	
	List<EmpleadoDTO> listarEmpleados();

	List<EmpleadoDTO> listarEmpleadosCodigo(Integer codigo);
	
	
}
