package com.facturacion.facturacion.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.facturacion.facturacion.Model.ClientsModel;
import com.facturacion.facturacion.Repository.ClientRepository;
import com.facturacion.facturacion.Service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    @Transactional(readOnly = true)
    public ClientsModel listarCliente(int id) {
       return clientRepository.findById(id).orElse(null);
       }

    @Override
    public List<ClientsModel> listarClientes() {
        return (List<ClientsModel>) clientRepository.findAll();
    }

    @Override
    public void eliminarCliente(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarCliente'");
    }

    @Override
    public void guardarCliente(ClientsModel clientsModel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarCliente'");
    }
    
}
