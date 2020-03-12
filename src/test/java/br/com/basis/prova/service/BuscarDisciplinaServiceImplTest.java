package br.com.basis.prova.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Objects;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.repository.DisciplinaRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class BuscarDisciplinaServiceImplTest {

	@Autowired
	private BuscarDisciplinasServiceImpl serviceImpl;

	@Autowired
	private DisciplinaRepository disciplinaRepository;

	@Test
	public void buscarTodasAsDisciplinasTest() {
		List<Disciplina> listaDisciplinas = serviceImpl.buscarTodosOsDisciplinas();
		List<Disciplina> listaDisciplinasDatabase = disciplinaRepository.findAll();
		Disciplina disciplinaService = listaDisciplinas.stream().findFirst().get();
		Disciplina disciplinaDatabase = listaDisciplinasDatabase.stream().findFirst().get();
		assertNotNull(Objects.nonNull(listaDisciplinas));
		assertEquals(disciplinaDatabase.getNome(), disciplinaService.getNome());
		assertEquals(disciplinaDatabase.getDescricao(), disciplinaService.getDescricao());
		assertEquals(disciplinaDatabase.getCargaHoraria(), disciplinaService.getCargaHoraria());
		assertEquals(disciplinaDatabase.getAtiva(), disciplinaService.getAtiva());
		assertEquals(disciplinaDatabase.getProfessor(), disciplinaService.getProfessor());
		assertEquals(listaDisciplinas.size(), listaDisciplinasDatabase.size());
	}
}
