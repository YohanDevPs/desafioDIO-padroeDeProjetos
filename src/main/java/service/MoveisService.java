package service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import model.Moveis;

@FeignClient(name = "codigomoveis", url = "https://codigomoveis.com.br/ws")
public interface MoveisService {
	
	@GetMapping("/{codigoMoveis}/json/")
	Moveis consultarCodigoMovel(@PathVariable("codigo") String codigoMoveis);

}
