package br.com.falcao.SpringCloudEurekaClientConsumer.config.instance;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

@Service
public class EurekaServiceInstance {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	public URI buscarInstancia(String providerId) {
		List<ServiceInstance> instanciasBuscadas = this.discoveryClient.getInstances(providerId);
		if(instanciasBuscadas != null && instanciasBuscadas.size() > 0) {
            return instanciasBuscadas.get(0).getUri();
        }
        return null;
	}
	
}
