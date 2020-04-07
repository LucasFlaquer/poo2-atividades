package com.example.atividade2.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable{

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  
  @Id
  private int id;
  private String nome;
  private String cpf;
  private String email;
  private double salario;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public Funcionario() {}

  public Funcionario(int id, String nome, String cpf, String email, double salario) {
    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.salario = salario;
  }

  @Override
  public String toString() {
    return "Funcionario [cpf=" + cpf + ", email=" + email + ", id=" + id + ", nome=" + nome + ", salario=" + salario
        + "]";
  }
    
}