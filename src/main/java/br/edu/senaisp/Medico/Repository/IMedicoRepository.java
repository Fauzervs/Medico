package br.edu.senaisp.Medico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.senaisp.Medico.Model.Medico;

@Repository
public interface IMedicoRepository extends JpaRepository<Medico, Integer> {

}
