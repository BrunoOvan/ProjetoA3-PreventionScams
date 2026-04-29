package com.projetoa3.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_registros")
public class CasosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePrefeitura;
    private String tipoGolpe;
    private String descricao;

    // Construtor Vazio (Obrigatório para o Spring)
    public CasosModel() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    /**
     * Define o ID do registro
     * @param id ID a ser atribuído
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtém o nome da prefeitura relacionada ao caso
     * @return 
     */
    public String getNomePrefeitura() {
        return nomePrefeitura;
    }

    /**
     * Define o nome da prefeitura
     * @param nomePrefeitura 
     */
    public void setNomePrefeitura(String nomePrefeitura) {
        this.nomePrefeitura = nomePrefeitura;
    }

    /**
     * Obtém o tipo de golpe do caso
     * @return Tipo do golpe aplicado
     */
    public String getTipoGolpe() {
        return tipoGolpe;
    }

    /**
     * Define o tipo de golpe
     * @param tipoGolpe 
     */
    public void setTipoGolpe(String tipoGolpe) {
        this.tipoGolpe = tipoGolpe;
    }

    /**
     * Obtém a descrição do caso/incidente
     * @return Descrição detalhada do caso
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do caso
     * @param descricao Descrição do incidente
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}