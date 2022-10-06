package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.ClientRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClientRequest clienteRequest);

}
