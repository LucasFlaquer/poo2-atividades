package com.example.atividade02.service;

import java.util.List;

import com.example.atividade02.entity.Funcionario;
import com.example.atividade02.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

  @Autowired
  private FuncionarioRepository repository;

  public List<Funcionario> getFuncionarios() {
    return repository.findAll();
  }

  public void salvar(Funcionario func) {
    repository.save(func);
  }

}