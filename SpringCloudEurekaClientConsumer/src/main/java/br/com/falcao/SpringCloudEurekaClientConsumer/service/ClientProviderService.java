package br.com.falcao.SpringCloudEurekaClientConsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.falcao.SpringCloudEurekaClientConsumer.consumer.ClientProviderConsumer;

@Service
public class ClientProviderService {

	@Autowired
	private ClientProviderConsumer clientProviderConsumer;
	
	public String olaMundo(String nome) {
		String clientProvider = this.clientProviderConsumer.buscarClientProviderInstance();
		return clientProvider + ", " + nome + "!";
	}
	
}
