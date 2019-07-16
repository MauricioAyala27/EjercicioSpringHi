package controller;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.PersonaDao;
import entity.Persona;



@Controller
public class ControllerDatos {
	
	
//	@RequestMapping("/")
//	public String homeInit() {
//		return "/index";
//	}
//	
//	@RequestMapping("/index")
//    public void insertar(@RequestParam(value="nombre",required= false,defaultValue = "Vacio")String nombre,@RequestParam(value="apellido",required= false,defaultValue = "Vacio")String apellido,
//		@RequestParam(value="genero",required= false,defaultValue = "Vacio")String genero,@RequestParam(value="email",required= false,defaultValue = "Vacio")String email) {
//			
//    		PersonaDao peDao = new PersonaDao();
//			Persona per = new Persona();
//			per.setNombre(nombre);
//			per.setApellido(apellido);
//			per.setGenero(genero);
//			per.setEmail(email);
//			peDao.savePersona(per);
//			
//			List<Persona>personas = peDao.getPersonas();
//			personas.forEach(s -> System.out.println(s.getNombre()));
//		
//
//	}
	
	@RequestMapping("/")
	public String insertar(Model mv) {
		
		mv.addAttribute("nombre", "pepe");
		
		return "index";
	}

}
