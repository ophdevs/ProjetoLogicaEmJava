package PetShop.entities;

import PetShop.entities.ennum.TiposServicos;

import java.util.Date;

public class ServicoPet {
    private Date data;
    private TiposServicos servicos;
    private Double preco;
    private Integer duracao;

    public ServicoPet(Date data, TiposServicos servicos, Double preco, Integer duracao) {
        this.data = data;
        this.servicos = servicos;
        this.preco = preco;
        this.duracao = duracao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TiposServicos getServicos() {
        return servicos;
    }

    public void setServicos(TiposServicos servicos) {
        this.servicos = servicos;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
