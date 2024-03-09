package br.com.teste.primeirorest.view.model;

import br.com.teste.primeirorest.compartilhado.AnimalDto;

import java.util.List;

public class PessoaModeloResponseDetahes extends PessoaModeloResponse {
    private List<AnimalDto> animais;

    public List<AnimalDto> getAnimais() {
        return animais;
    }

    public void setAnimais(List<AnimalDto> animais) {
        this.animais = animais;
    }
}
