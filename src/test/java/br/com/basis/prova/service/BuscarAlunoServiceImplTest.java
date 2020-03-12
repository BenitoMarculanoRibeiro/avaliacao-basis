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

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.repository.AlunoRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class BuscarAlunoServiceImplTest {

	@Autowired
	private BuscarAlunosServiceImpl serviceImpl;

	@Autowired
	private AlunoRepository alunoRepository;

	@Test
	public void buscarTodosOsAlunosTest() {
		List<Aluno> listaAlunos = serviceImpl.buscarTodosOsAlunos();
		List<Aluno> listaAlunosDatabase = alunoRepository.findAll();
		Aluno alunoService = listaAlunos.stream().findFirst().get();
		Aluno alunoDatabase = listaAlunosDatabase.stream().findFirst().get();
		assertNotNull(Objects.nonNull(listaAlunos));
		assertEquals(alunoDatabase.getNome(), alunoService.getNome());
		assertEquals(alunoDatabase.getMatricula(), alunoService.getMatricula());
		assertEquals(alunoDatabase.getCpf(), alunoService.getCpf());
		assertEquals(alunoDatabase.getDataNascimento(), alunoService.getDataNascimento());
		assertEquals(listaAlunos.size(), listaAlunosDatabase.size());
	}
}