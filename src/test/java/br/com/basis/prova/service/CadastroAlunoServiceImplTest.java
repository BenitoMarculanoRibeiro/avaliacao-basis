package br.com.basis.prova.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.repository.AlunoRepository;
import br.com.basis.prova.resource.model.AlunoResource;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
//@Sql(scripts = "/sql/delete_alunos.sql")
public class CadastroAlunoServiceImplTest {

	@Autowired
	private CadastroAlunoServiceImpl serviceImpl;

	@Autowired
	private AlunoRepository alunoRepository;

	private AlunoResource resource;

	@Before
	public void setUp() {
		resource = new AlunoResource();
		resource.setNome("Marcia");
		resource.setCpf("12345678912");
		resource.setDataNascimento("1987-11-12");
		resource.setMatricula("20181TADSt0180");
	}

	/*
	 * public Professor prof() { Professor resourc = new Professor();
	 * resourc.setId(1500); resourc.setNome("Murilo"); resourc.setMatricula("P123");
	 * resourc.setArea("TI");
	 * resourc.setDataNascimento(LocalDate.parse("1999-11-11")); return resourc; }
	 * 
	 */ @Test
	public void cadastroTest() {
		serviceImpl.cadastro(resource);

		Aluno aluno = alunoRepository.findAll().stream().filter(alun -> alun.getNome().equals("Marcia")).findFirst()
				.get();
		assertEquals("Marcia", aluno.getNome());
		assertEquals("20181TADSt0180", aluno.getMatricula());
		assertEquals("12345678912", aluno.getCpf());
		assertEquals("1987-11-12", aluno.getDataNascimento());
	}

}
