package com.example.atividade2.controller;

import com.example.atividade2.entity.Funcionario;
import com.example.atividade2.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {

  @Autowired
  private FuncionarioService service;
  
  @GetMapping("/funcionarios")
  public ModelAndView index() {
    ModelAndView mv = new ModelAndView("index");
    mv.addObject("funcionarios", service.getFuncionarios());
    return mv;
  }

  @PostMapping("/funcionarios")
  public String store(@ModelAttribute Funcionario func) {
    service.salvar(func);
    return "redirect:/funcionarios";
  }

}