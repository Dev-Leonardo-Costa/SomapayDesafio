package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import datasource.model.Empresa;
import repository.EmpresaRepository;

@Service
public class BuscarEmpresaServiceImpl {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	public List<Empresa> buscarTodasAsEmpresas(){
		List<Empresa> listEmpresas = empresaRepository.findAll();
		return listEmpresas;
	}
}
