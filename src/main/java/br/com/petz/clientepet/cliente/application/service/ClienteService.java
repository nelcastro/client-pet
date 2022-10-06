package br.com.petz.clientepet.cliente.application.service;

import java.util.List;

import br.com.petz.clientepet.cliente.application.api.ClientRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteListResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClientRequest clienteRequest);

	List<ClienteListResponse> buscarTodosClientes();

}
