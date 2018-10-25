package com.cristianruizblog.inyeccion.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class SistemaOperativoServiceLinux implements SistemaOperativoService{

	@Override
	public String getNombre() {
		return "Linux";
	}

	@Override
	public String getExtensionArchivos() {
		return ".app";
	}

	@Override
	public String getLibrerias() {
		return "so";
	}

}
