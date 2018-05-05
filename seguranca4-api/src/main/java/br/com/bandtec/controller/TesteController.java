package br.com.bandtec.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bandtec.vo.Aluno;

@RestController
@RequestMapping(value = "/seguranca")
public class TesteController {

    static List<Aluno> alunos = new ArrayList<>();

    static {
        alunos.add(new Aluno(1, "Ze Buduia", 70.5, 30));
        alunos.add(new Aluno(2, "Ze Ruela", 78.2, 20));
        alunos.add(new Aluno(3, "Maira Biodenha", 120.5, 61));
    }

	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List> Listar() {
		return ResponseEntity.ok(alunos);
	}
	
}
