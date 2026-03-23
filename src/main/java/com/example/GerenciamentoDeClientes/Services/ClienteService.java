package com.example.GerenciamentoDeClientes.Services;

import com.example.GerenciamentoDeClientes.Models.ClienteModel;
import com.example.GerenciamentoDeClientes.Repositories.ClienteRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepositorie clienteRepositorie;

    public ClienteModel criarCliente(ClienteModel clienteModel) {
        return clienteRepositorie.save(clienteModel);
    }

    public List<ClienteModel> buscarClientes() {
        return clienteRepositorie.findAll();
    }

    public ClienteModel buscarId(Long id) {
        return clienteRepositorie.findById(id).get();
    }

    public void deletarCliente(Long id) {
        clienteRepositorie.deleteById(id);
    }
}