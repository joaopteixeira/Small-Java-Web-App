package atec.pt.testejava25junho.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import atec.pt.testejava25junho.model.ModelTeste;
import atec.pt.testejava25junho.service.ModeloRepository;

@Controller
//@RequestMapping("/placeholder")
public class Hteste {
	
	@Autowired
	ModeloRepository repository;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	private String addicionancos() {
		return "add.html";
	}
	
	@GetMapping("/view")
	private String show(@ModelAttribute("ModelTeste") ModelTeste a, Model m) {
		
		System.out.println(a.getId());
		repository.save(a);
		
		m.addAttribute("ModelTeste", a);
		return "view.html";
	}
	
	@GetMapping("/list")
	private String listar(Model m) {
		m.addAttribute("ModelTeste", repository.findAll());
		
		return "list.html";
	}
	
	
	@GetMapping("/update")
	private String updatar(@RequestParam("id") String id, Model m ) { 

		
		for(ModelTeste mt : repository.findAll() ) {
			
			if(mt.getId().compareTo(id) == 0) {
				
				m.addAttribute("ModelTeste",mt);
		
			}
		}
			
			
		return "update.html";
	}
	
	@GetMapping("/delete")
	private String delletar(@RequestParam("id") String id){
		
		System.out.println(id+"\n");
				
	for(ModelTeste mt : repository.findAll()) {
			
		
		
		
			if(mt.getId().equals(id)) {
				
				repository.delete(mt);
				break;
			}
			
		}
	
		return "apagado_com_exito.html";
	}
	
	@GetMapping("/procurar")
	private String procuradorgeral(String procurar,Model m ){
		
	
		
		
		
		return "procurar.html";
	}
	
	@GetMapping("/proc")
	private String proc(String procurar,Model m ){
		
	
		
		
	for(ModelTeste mt : repository.findAll()) {
			

			if(mt.getLocalReparacao().compareTo(procurar) == 0) {
				m.addAttribute("ModelTeste",mt);
				return "mostra.html";
				
				
			}
			
		}
			return "naoEncontrado.html";
	}


	@GetMapping("/procPecas")
	private String procPecas(String procurar,Model m ){
		
	
		
		
	for(ModelTeste mt : repository.findAll()) {
			

			if(mt.getPecasColocadas().compareTo(procurar) == 0 ) {
				m.addAttribute("ModelTeste",mt);
				return "mostra.html";		
			}
			
			
		}
	
	return "naoEncontrado.html";
	}
	
}
