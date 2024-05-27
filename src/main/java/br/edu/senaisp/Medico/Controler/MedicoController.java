package br.edu.senaisp.Medico.Controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.senaisp.Medico.Model.Medico;
import br.edu.senaisp.Medico.Repository.IMedicoRepository;

@RestController
@RequestMapping("/medico")
public class MedicoController {
	
    @Autowired
	IMedicoRepository repository;	

	
    @GetMapping
    public ResponseEntity<List<Medico>> listarMedicos(){
    	return ResponseEntity.ok(repository.findAll());
    }
    
    @GetMapping("/{id}")
    public Optional<Medico> BuscaPorId1(@PathVariable int id){
    	Optional<Medico> medico = repository.findById(id);
    	
    	return medico;
    }
    
	@PutMapping("/{id}")
	public String Altera(@RequestBody Medico medico, @PathVariable int id) 
	{
	medico.setNome(medico.getNome());
		return String.valueOf(  medico  ) ;
	}
	
	@PostMapping()
	public Medico Novo(@RequestBody Medico medico) {
		repository.save(medico);
		return medico;
	}
	
}
