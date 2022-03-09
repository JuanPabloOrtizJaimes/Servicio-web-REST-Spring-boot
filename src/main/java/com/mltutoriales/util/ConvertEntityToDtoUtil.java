package com.mltutoriales.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mltutoriales.dto.EmpleadoDTO;
import com.mltutoriales.entity.EmpleadoEntity;

@Component("convertEntityToDtoUtil")
public class ConvertEntityToDtoUtil {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public EmpleadoDTO convertToDTOEmpleado(EmpleadoEntity empleadoEntity){
		
		EmpleadoDTO empleadoDTO=null;
		
		if (empleadoEntity!=null) {
			empleadoDTO=modelMapper.map(empleadoEntity, EmpleadoDTO.class);
		}
		return empleadoDTO;
		
		
	}

}
