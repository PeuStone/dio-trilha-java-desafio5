package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private final int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Curso{ " +
                "titulo=' " + getTitulo() + '\'' +
                ", descricao=' " + getDescricao() + '\'' +
                ", cargaHoraria= " + cargaHoraria +
                "}";
    }


}
