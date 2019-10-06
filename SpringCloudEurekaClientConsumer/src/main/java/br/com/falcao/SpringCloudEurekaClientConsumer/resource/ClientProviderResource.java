package br.com.falcao.SpringCloudEurekaClientConsumer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.falcao.SpringCloudEurekaClientConsumer.service.ClientProviderService;

@RestController
@RequestMapping("/mensagem")
public class ClientProviderResource {

	@Autowired
	private ClientProviderService clientProviderService;
	
	@GetMapping("/{nome}")
	public ResponseEntity<String> olaMundo(@PathVariable String nome){
		return ResponseEntity.ok().body(this.clientProviderService.olaMundo(nome));
	}
	
}
