package br.inf.tse.eleitoradosever.infraestrutura.entidade;

import br.inf.tse.eleitoradosever.dominio.PerfilEleitorado;
import javax.persistence.*;

/**
 * @author gabriel
 * @version 1.0.0
 */
@Entity
public class PerfilEleitoradoEntidade  {

    /**
     * Indentificador unico da entidade.
     *
     * a estratégia de geração autómatica de ids facilita a persistencia na base
     * de dados.
     */
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;


    @Column
    private Integer periodo;

    @Column
    private String uf;

    @Column
    private String municipio;

    @Column
    private Integer codMunicipioTse;

    @Column
    private Integer nrZona;

    @Column
    private String sexo;

    @Column
    private String faixaEtaria;

    @Column
    private String grauEscolaridade;

    @Column
    private Integer qtqEleitoresNoPerfil;

    public static PerfilEleitoradoEntidade converteDominio(PerfilEleitorado dominio) {
        PerfilEleitoradoEntidade entidade = new  PerfilEleitoradoEntidade();
            entidade.periodo = dominio.getPeriodo();
            entidade.uf = dominio.getUf();
            entidade.municipio = dominio.getMunicipio();
            entidade.codMunicipioTse = dominio.getCodMunicipioTse();
            entidade.nrZona = dominio.getNrZona();
            entidade.sexo = dominio.getSexo();
            entidade.faixaEtaria = dominio.getFaixaEtaria();
            entidade.grauEscolaridade = dominio.getGrauEscolaridade();
            entidade.qtqEleitoresNoPerfil = dominio.getQtqEleitoresNoPerfil();
        return entidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Integer getCodMunicipioTse() {
        return codMunicipioTse;
    }

    public void setCodMunicipioTse(Integer codMunicipioTse) {
        this.codMunicipioTse = codMunicipioTse;
    }

    public Integer getNrZona() {
        return nrZona;
    }

    public void setNrZona(Integer nrZona) {
        this.nrZona = nrZona;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getGrauEscolaridade() {
        return grauEscolaridade;
    }

    public void setGrauEscolaridade(String grauEscolaridade) {
        this.grauEscolaridade = grauEscolaridade;
    }

    public Integer getQtqEleitoresNoPerfil() {
        return qtqEleitoresNoPerfil;
    }

    public void setQtqEleitoresNoPerfil(Integer qtqEleitoresNoPerfil) {
        this.qtqEleitoresNoPerfil = qtqEleitoresNoPerfil;
    }
}
