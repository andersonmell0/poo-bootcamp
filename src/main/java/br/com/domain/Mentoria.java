package br.com.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate dataMentoria;
	
	@Override
	public double calculaXp() {
		return XP_PADRAO + 20;
	}
	
	public LocalDate getDataMentoria() {
		return dataMentoria;
	}
	public void setDataMentoria(LocalDate dataMentoria) {
		this.dataMentoria = dataMentoria;
	}			
	
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", dataMentoria=" + dataMentoria + "]";
	}
	
}