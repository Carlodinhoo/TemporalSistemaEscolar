package mx.unam.ciencias.is.sistemaescolar.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Juan C
 */

@Controller
public class HolaMundo {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String mensaje = "Hello World!";
		return new ModelAndView("welcome", "mensaje", mensaje);
	}

}
