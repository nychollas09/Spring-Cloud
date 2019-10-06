package br.com.falcao.SpringCloudEurekaClientProvider.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.falcao.SpringCloudEurekaClientProvider.service.MensagemService;

@RestController
@RequestMapping("/mensagem")
public class MensagemResource {

	@Autowired
	private MensagemService mensagemService;
	
	@GetMapping
	public ResponseEntity<String> olaMundo(){
		return ResponseEntity.ok().body(this.mensagemService.olaMundo());
	}
	
}
