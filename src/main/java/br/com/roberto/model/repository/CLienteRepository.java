package br.com.roberto.model.repository;

import br.com.roberto.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CLienteRepository extends JpaRepository<Cliente, Long> {
}
