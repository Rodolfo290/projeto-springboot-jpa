package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Order;
import com.example.demo.repository.OrderRepository;

@Service // classe aqui é uma classe de serviço!
public class OrderService {

	@Autowired // para injeção de dependencia
	private OrderRepository repository;

	// metodo para retornar todos usuaros do banco de dados
	public List<Order> findAll() {
		return repository.findAll();

	}

	// metodo para buscar pelo Id
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();

	}

}
