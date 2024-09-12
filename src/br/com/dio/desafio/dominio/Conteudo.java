package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    protected String titulo;
    protected String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public abstract void setTitulo(String titulo);

    public String getDescricao() {
        return descricao;
    }

    public abstract void setDescricao(String descricao);
}
