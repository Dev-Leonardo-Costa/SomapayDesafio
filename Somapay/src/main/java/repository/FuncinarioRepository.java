package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import datasource.model.Funcionario;

public interface FuncinarioRepository  extends JpaRepository<Funcionario, Long>{

}
