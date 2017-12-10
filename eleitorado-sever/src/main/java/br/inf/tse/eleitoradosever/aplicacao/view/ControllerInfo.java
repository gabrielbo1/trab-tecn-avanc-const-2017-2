package br.inf.tse.eleitoradosever.aplicacao.view;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author gabriel
 * @version 1.0.0
 */
@RestController
public class ControllerInfo {

    @GetMapping("/info")
    public ModelAndView info(ModelMap map) {
        return new ModelAndView("redirect:/info/index.html", map);
    }

}
