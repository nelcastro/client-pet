package br.com.petz.clientepet.cliente.application.service;



import java.util.List;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet.cliente.application.api.ClientRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteListResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.application.repository.ClienteRepository;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClientRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente=clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criCliente");
		return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
	}

	@Override
	public List<ClienteListResponse> buscarTodosClientes() {
		log.info("[inicia] ClienteApplicationService - buscarTodosClientes");
		List<Cliente> clientes=clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - buscarTodosClientes");
		return ClienteListResponse.converte(clientes);
	}

}
