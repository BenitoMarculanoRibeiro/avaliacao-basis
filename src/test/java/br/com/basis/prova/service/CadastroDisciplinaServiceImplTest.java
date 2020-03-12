package br.com.basis.prova.service;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.repository.DisciplinaRepository;
import br.com.basis.prova.resource.model.DisciplinaResource;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
//@Sql(scripts = "/sql/delete_disciplinas.sql")
public class CadastroDisciplinaServiceImplTest {

	@Autowired
	private CadastroDisciplinaServiceImpl serviceImpl;

	@Autowired
	private DisciplinaRepository disciplinaRepository;

	private DisciplinaResource resource;

	@Before
	public void setUp() {
		resource = new DisciplinaResource();
		resource.setNome("P1");
		resource.setDescricao("Disciplina de Programação 1");
		resource.setCargaHoraria("40");
		resource.setAtiva("1");
		resource.setProfessor(prof());
	}

	public Professor prof() {
		Professor resourc = new Professor();
		resourc.setId(1500);
		resourc.setNome("Murilo");
		resourc.setMatricula("P123");
		resourc.setArea("TI");
		resourc.setDataNascimento(LocalDate.parse("1999-11-11"));
		return resourc;
	}

	@Test
	public void cadastroTest() {
		serviceImpl.cadastro(resource);

		Disciplina disciplina = disciplinaRepository.findAll().stream().filter(disc -> disc.getNome().equals("P1"))
				.findFirst().get();
		assertEquals("P1", disciplina.getNome());
		assertEquals("0", disciplina.getAtiva());
		assertEquals("40", disciplina.getCargaHoraria());
		assertEquals("Disciplina de Programação 1", disciplina.getDescricao());
		assertEquals("1500", disciplina.getProfessor().getId());
	}

}
