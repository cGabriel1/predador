package com.predador.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.predador.entidade.Produto;

import jakarta.persistence.EntityManager;

@Repository
public interface ProdutoDAO extends JpaRepository<Produto, Integer> {

	
	
}
