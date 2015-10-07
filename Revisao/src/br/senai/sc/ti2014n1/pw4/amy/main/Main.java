package br.senai.sc.ti2014n1.pw4.amy.main;

import br.senai.sc.t12014n1.pw4.amy.model.UserRn;
import br.senai.sc.ti2014n1.pw4.amy.dao.Dao;
import br.senai.sc.ti2014n1.pw4.amy.dominio.User;


public class Main {

	public static UserRn userRn;
	
	public static void main(String [] args){
		userRn=new UserRn();
	}
	
	private static void excluir(){
		try{
			userRn.excluir(3L);
			System.out.println("Excluido");
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void editar(){
		User user = userRn.buscarPorId(1L);
		user.setNome(user.getNome().concat(" A."));
		try {
			userRn.salvar(user);
			System.out.println("Salvo");
		} catch (Exception e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private static void buscarPorId() {
		mostrar(userRn.buscarPorId(2L));
	}

	private static void listarTodos() {
		for(User user : userRn.listar()){
			mostrar(user);
		}
	}

	private static void mostrar(User user) {
		System.out.println("Nome: " + user.getNome());
		System.out.println("Endereço: " + user.getEndereco());
		System.out.println("Profissao:"+ user.getProfissao());
		System.out.println("Cidade:"+ user.getCidade());
		System.out.println("------------------------------");
	}

	private static void inserirUm() {
		User user = new User();
		user.setNome("Maria");
		user.setEndereco("Rua da ....");
		user.setProfissao("Desempregado");
		user.setCidade("Florianópolis");
		try {
			userRn.salvar(user);
			System.out.println("Salvo");
		} catch (Exception e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private static void conectar() {
		Dao dao = new Dao() {
		};
		dao.getConnection();
	}


}
