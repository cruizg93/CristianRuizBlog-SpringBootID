package com.cristianruizblog.inyeccion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cristianruizblog.inyeccion.services.SistemaOperativoService;

	@Controller
	public class DemoController {
	
		SistemaOperativoService sistemaOperativoService1;
		SistemaOperativoService sistemaOperativoService2;
		SistemaOperativoService sistemaOperativoService3;
		
		
		public DemoController(SistemaOperativoService sistemaOperativoServiceWindows, 
								SistemaOperativoService sistemaOperativoServiceLinux,
								SistemaOperativoService sistemaOperativoServiceMac) {
			this.sistemaOperativoService1 = sistemaOperativoServiceWindows;
			this.sistemaOperativoService2 = sistemaOperativoServiceLinux;
			this.sistemaOperativoService3 = sistemaOperativoServiceMac;
		}



	@GetMapping("/windows")
	public String indexWindows(Model model) {
		model.addAttribute("os",sistemaOperativoService1.getNombre());
		model.addAttribute("app",sistemaOperativoService1.getExtensionArchivos());
		model.addAttribute("libs",sistemaOperativoService1.getLibrerias());
		return "index";
	}
	@GetMapping("/linux")
	public String indexLinux(Model model) {
		model.addAttribute("os",sistemaOperativoService2.getNombre());
		model.addAttribute("app",sistemaOperativoService2.getExtensionArchivos());
		model.addAttribute("libs",sistemaOperativoService2.getLibrerias());
		return "index";
	}
	@GetMapping("/mac")
	public String indexMac(Model model) {
		model.addAttribute("os",sistemaOperativoService3.getNombre());
		model.addAttribute("app",sistemaOperativoService3.getExtensionArchivos());
		model.addAttribute("libs",sistemaOperativoService3.getLibrerias());
		return "index";
	}
}
