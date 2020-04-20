package com.example.atividade02.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String nome;
  private String cpf;
  private String email;
  private double salario;
  private int idade;

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

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

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  @Override
  public String toString() {
    return "Funcionario []";
  }

  public Funcionario(String nome, String cpf, String email, double salario, int idade) {
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.salario = salario;
    this.idade = idade;
  }

  public Funcionario() {
  }

}