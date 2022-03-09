/**
 * 
 */
package com.mltutoriales.controller;



import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mltutoriales.dto.EmpleadoDTO;
import com.mltutoriales.service.IEmpleado;

/**
 * @author Juan OJ
 *
 */
@Produces(("application/json"))
@RestController
@RequestMapping("/proyecto")//ruta servidorDondeesteDesplegado/proyecto
public class EmpleadoController {

	@Autowired
	private IEmpleado empleado;
	
	@GetMapping(path="/saludar/{nombre}")
	public String holaMundo(@PathVariable("nombre") String nombre){
		
		String respuesta=null;
		try {
			respuesta=empleado.holaMundo(nombre);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
		
		return respuesta;
	}
	
	
	@PostMapping(path="/guardar/empleado",consumes = MediaType.APPLICATION_JSON)
	public String guardarEmpleado(@RequestBody EmpleadoDTO empleadoDTO){
		
		String respuesta=null;
		try {
			respuesta=empleado.guardarEmpleado(empleadoDTO);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
		
		return respuesta;
	}
	
	
	@GetMapping(path="/listar")
	public List<EmpleadoDTO> listarEmpleados(){
		
		List<EmpleadoDTO> respuesta=null;
		try {
			respuesta=empleado.listarEmpleados();
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
		
		return respuesta;
	}
	
	@GetMapping(path="/listar/{codigo}")
	public List<EmpleadoDTO> listarEmpleadosCodigo(@PathVariable("codigo") Integer codigo){
		
		List<EmpleadoDTO> respuesta=null;
		try {
			respuesta=empleado.listarEmpleadosCodigo(codigo);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
		
		return respuesta;
	}
	

}
