package br.inf.tse.eleitoradosever.aplicacao.view;

import br.inf.tse.eleitoradosever.aplicacao.service.PerfilEleitoradoService;
import br.inf.tse.eleitoradosever.infraestrutura.entidade.PerfilEleitoradoEntidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;

/**
 * @author gabriel
 * @version 1.0.0
 */
@RestController
public class ControllerPerfilEleitoral {

    @Autowired
    private PerfilEleitoradoService service;

    @RequestMapping(value = "/perfilEleitoralCsv", method = RequestMethod.POST)
    public String uploadPerfilEleitoral(@RequestParam("file")MultipartFile file) throws Exception {
        if (!file.isEmpty()) {
            String csv = new String(file.getBytes(), "ISO-8859-1");
            service.cadastarAnoEleitoral(csv);
            return "ok";
        }

        return "Arquivo vazio.";
    }

    @RequestMapping(value = "/perfilEleitoral/findAll", method = RequestMethod.GET)
    public Collection<PerfilEleitoradoEntidade> buscarTodos() {
        return service.buscarTodos();
    }
}
