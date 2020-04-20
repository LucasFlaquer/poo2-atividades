package com.example.atividade02.controller;

import com.example.atividade02.entity.Funcionario;
import com.example.atividade02.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
  public String store(@ModelAttribute Funcionario func, RedirectAttributes attr) {

    if (func.getNome().trim().length() == 0 || func.getEmail().trim().length() == 0
        || func.getCpf().trim().length() == 0 || func.getIdade() == -1 || func.getSalario() == -1) {
      attr.addFlashAttribute("msg", "erros");
      return "redirect:/funcionarios";

    } else {
      service.salvar(func);

      return "redirect:/funcionarios";
    }
  }

}