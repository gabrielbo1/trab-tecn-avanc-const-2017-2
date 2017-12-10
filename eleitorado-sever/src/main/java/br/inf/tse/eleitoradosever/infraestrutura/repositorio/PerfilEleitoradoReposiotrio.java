package br.inf.tse.eleitoradosever.infraestrutura.repositorio;

import br.inf.tse.eleitoradosever.infraestrutura.entidade.PerfilEleitoradoEntidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author gabriel
 * @version 1.0.0
 *
 */
@Repository
public interface PerfilEleitoradoReposiotrio extends CrudRepository<PerfilEleitoradoEntidade, Long> {

}
