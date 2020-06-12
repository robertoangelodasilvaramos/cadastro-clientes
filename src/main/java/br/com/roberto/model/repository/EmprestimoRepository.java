package br.com.roberto.model.repository;


import br.com.roberto.model.entity.Cliente;
import br.com.roberto.model.entity.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}
