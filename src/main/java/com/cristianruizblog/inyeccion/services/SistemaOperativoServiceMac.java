package com.cristianruizblog.inyeccion.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class SistemaOperativoServiceMac implements SistemaOperativoService{

	@Override
	public String getNombre() {
		return "MacOS";
	}

	@Override
	public String getExtensionArchivos() {
		return ".app";
	}

	@Override
	public String getLibrerias() {
		return ".elf";
	}

}
