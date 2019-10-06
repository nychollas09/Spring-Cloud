package br.com.falcao.SpringCloudEurekaClientConsumer.consumer;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.falcao.SpringCloudEurekaClientConsumer.config.instance.EurekaServiceInstance;

@Component
public class ClientProviderConsumer {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private EurekaServiceInstance eurekaServiceInstance;
	
	@Value("${app.clientProvider.providerId}")
	private String clientProviderId;
	
	@Value("${app.clientProvider.endpoint.mensagem}")
	private String clientProviderEndPointMensagem;
	
	public String buscarClientProviderInstance() {
		URI uri = this.eurekaServiceInstance.buscarInstancia(this.clientProviderId);
		String clientProvider = this.restTemplate.getForObject(uri.toString() + this.clientProviderEndPointMensagem, String.class);
		return clientProvider;
	}
	
}
