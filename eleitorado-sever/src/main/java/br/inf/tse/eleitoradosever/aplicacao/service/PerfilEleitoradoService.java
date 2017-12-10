package br.inf.tse.eleitoradosever.aplicacao.service;

import br.inf.tse.eleitoradosever.dominio.PerfilEleitorado;
import br.inf.tse.eleitoradosever.infraestrutura.entidade.PerfilEleitoradoEntidade;
import br.inf.tse.eleitoradosever.infraestrutura.repositorio.PerfilEleitoradoReposiotrio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author gabriel
 * @version 1.0.0
 */
@Component
public class PerfilEleitoradoService {

    @Autowired
    private PerfilEleitoradoReposiotrio reposiotrio;

    public void cadastarAnoEleitoral(String csv) {
        reposiotrio.save(PerfilEleitorado.ano2016(csv)
                        .stream()
                        .map(PerfilEleitoradoEntidade::converteDominio)
                        .collect(Collectors.toList()));
    }

    public Collection<PerfilEleitoradoEntidade> buscarTodos() {
        return StreamSupport.stream(reposiotrio.findAll().spliterator(), false)
                            .collect(Collectors.toList());
    }
}
