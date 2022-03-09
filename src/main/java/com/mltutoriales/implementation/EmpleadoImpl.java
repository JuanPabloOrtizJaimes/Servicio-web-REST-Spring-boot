/**
 * 
 */
package com.mltutoriales.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mltutoriales.dto.EmpleadoDTO;
import com.mltutoriales.entity.EmpleadoEntity;
import com.mltutoriales.repository.EmpleadoRepository;
import com.mltutoriales.service.IEmpleado;
import com.mltutoriales.util.ConvertEntityToDtoUtil;

/**
 * @author Juan OJ
 *
 */
@Service
public class EmpleadoImpl implements IEmpleado {

	@Autowired
	@Qualifier("empleadoRepository")
	private EmpleadoRepository empleadoRepository;

	@Autowired
	private ConvertEntityToDtoUtil convertEntityToDtoUtil;

	@Override
	public String holaMundo(String nombre) {

		return "Hola Mundo " + nombre;
	}

	@Override
	public String guardarEmpleado(EmpleadoDTO empleadoDTO) {

		EmpleadoEntity empleadoEntity = new EmpleadoEntity();
		empleadoEntity.setCodigo(empleadoDTO.getCodigo());
		empleadoEntity.setNombre(empleadoDTO.getNombre());
		empleadoEntity.setSalario(empleadoDTO.getSalario());

		empleadoRepository.save(empleadoEntity);
		return "Guardado";
	}

	@Override
	public List<EmpleadoDTO> listarEmpleados() {
		List<EmpleadoDTO> list = null;
		List<EmpleadoEntity> empleadoEntities = empleadoRepository.findAll();
		list = empleadoEntities.stream().map(param -> convertEntityToDtoUtil.convertToDTOEmpleado(param))
				.collect(Collectors.toList());
		return list;
	}

	@Override
	public List<EmpleadoDTO> listarEmpleadosCodigo(Integer codigo) {
		List<EmpleadoDTO> list = null;
		List<EmpleadoEntity> empleadoEntities = empleadoRepository.listarEmpleados(codigo);
		list = empleadoEntities.stream().map(param -> convertEntityToDtoUtil.convertToDTOEmpleado(param))
				.collect(Collectors.toList());
		return list;
	}
}
