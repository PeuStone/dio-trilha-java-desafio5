package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(String titulo, String descricao,LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
