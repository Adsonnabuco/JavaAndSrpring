package med.voll.api.medico;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//Interface repository é uma interface que herda desse JpaRepository, e que
//recebe generics, a entidade e seu respectivo tipo de chave primaria
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
