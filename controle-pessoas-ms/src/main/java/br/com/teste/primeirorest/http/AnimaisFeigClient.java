package br.com.teste.primeirorest.http;

import br.com.teste.primeirorest.compartilhado.AnimalDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@FeignClient(name = "controle-animais-ms")
public interface AnimaisFeigClient {
    @GetMapping(path = "/api/animais/{dono}/lista")
    List<AnimalDto> obterAnimas( @PathVariable("dono") Integer dono);

}
