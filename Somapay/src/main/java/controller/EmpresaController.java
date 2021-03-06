package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import datasource.model.Empresa;
import repository.EmpresaRepository;
import service.BuscarEmpresaServiceImpl;

@RestController
@RequestMapping(path = "/cadastro")
public class EmpresaController {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private BuscarEmpresaServiceImpl buscarService;
	
	@GetMapping(path = "/empresas")
	public List<Empresa> buscarEmpresa(){
		return buscarService.buscarTodasAsEmpresas();
	}
	
	@GetMapping(path = "/empresa/id/{id}")
	public Optional<Empresa> budcarEmpresaPorId(@PathVariable(name = "id",required = true) Long id){
		return empresaRepository.findById(id);
	}
	
	@PostMapping(path = "/empresa/save")
	public void salvarEmpresa(@RequestBody Empresa empresa) {
		empresaRepository.save(empresa);
	}
	
	@DeleteMapping(path = "/empresa/delete/{id}")
	public void excluirEmpresa(@PathVariable(name = "id", required = true) Long id) {
		empresaRepository.deleteById(id);
	}
}
