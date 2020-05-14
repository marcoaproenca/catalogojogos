package com.marcocorp.catalogojogos.dao;

import org.springframework.data.repository.CrudRepository;

import com.marcocorp.catalogojogos.model.Jogo;

public interface JogoDAO extends CrudRepository<Jogo, Integer> {

}
