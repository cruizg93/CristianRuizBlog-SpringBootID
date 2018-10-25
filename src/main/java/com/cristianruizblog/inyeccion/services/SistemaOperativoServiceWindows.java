package com.cristianruizblog.inyeccion.services;

import org.springframework.stereotype.Service;

@Service
public class SistemaOperativoServiceWindows implements SistemaOperativoService{

	@Override
	public String getNombre() {
		return "Windows";
	}

	@Override
	public String getExtensionArchivos() {
		return ".exe";
	}

	@Override
	public String getLibrerias() {
		return ".dll";
	}

	
}
