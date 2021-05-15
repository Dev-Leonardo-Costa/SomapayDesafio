package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import datasource.model.Empresa;
import repository.EmpresaRepository;

@Service
public class CadastroEmpresa {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	public void cadastro(Empresa empresa) {
		empresaRepository.saveAndFlush(empresa);
	}
}
