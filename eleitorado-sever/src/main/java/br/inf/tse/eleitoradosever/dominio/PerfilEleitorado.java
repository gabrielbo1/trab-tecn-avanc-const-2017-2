package br.inf.tse.eleitoradosever.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author gabriel
 * @version 1.0.0
 *
 * Classe base com todos os campos que fazem parte
 * das informções referentes ao eleitorado independentemente
 * do ano da eleição para demais anos eleitorais existem
 * campos que foram acrescentados e ao padrão de informação.
 *
 * Por esse motivo a classe contém mais campos informações que
 * podem não vir preenchidas em alguns anos eleitorais.
 */
public class PerfilEleitorado {

    private Integer periodo;

    private String uf;

    private String municipio;

    private Integer codMunicipioTse;

    private Integer nrZona;

    private String sexo;

    private String faixaEtaria;

    private String grauEscolaridade;

    private Integer qtqEleitoresNoPerfil;


    private PerfilEleitorado() { }

    public static Collection<PerfilEleitorado> ano2016(String csv) {
        List<PerfilEleitorado> ano2016 = new ArrayList<>();
        Arrays.asList(csv.split("\\R"))
                .stream()
                .map((arrayLinha) -> arrayLinha.split(";"))
                .collect(Collectors.toList())
                .forEach((linha) -> {
                       //RETIRA AS ASPAS DA LINHA DO CSV PARA
                       //CONVERTER DE MANEIRA CORRETA A STRING
                       for (int i = 0; i < linha.length; i++)
                           linha[i] = linha[i].replace("\"", "");

                       PerfilEleitorado novoPerfil = new PerfilEleitorado();
                            novoPerfil.periodo = Integer.valueOf(linha[0]);
                            novoPerfil.uf = linha[1];
                            novoPerfil.municipio = linha[2];
                            novoPerfil.codMunicipioTse = Integer.valueOf(linha[3]);
                            novoPerfil.nrZona = Integer.valueOf(linha[4]);
                            novoPerfil.sexo = linha[5];
                            novoPerfil.faixaEtaria = linha[6];
                            novoPerfil.grauEscolaridade = linha[7];
                            novoPerfil.qtqEleitoresNoPerfil = Integer.valueOf(linha[8]);
                       ano2016.add(novoPerfil);
                });
        return ano2016;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public String getUf() {
        return uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public Integer getCodMunicipioTse() {
        return codMunicipioTse;
    }

    public Integer getNrZona() {
        return nrZona;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public String getGrauEscolaridade() {
        return grauEscolaridade;
    }

    public Integer getQtqEleitoresNoPerfil() {
        return qtqEleitoresNoPerfil;
    }
}
