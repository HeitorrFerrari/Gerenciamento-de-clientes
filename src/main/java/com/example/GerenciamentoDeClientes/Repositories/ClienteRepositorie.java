package com.example.GerenciamentoDeClientes.Repositories;

import com.example.GerenciamentoDeClientes.Models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorie extends JpaRepository<ClienteModel, Long> {
}