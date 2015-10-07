package br.senai.sc.t12014n1.pw4.amy.model;

import java.util.List;

import br.senai.sc.ti2014n1.pw4.amy.dao.UserDao;
import br.senai.sc.ti2014n1.pw4.amy.dominio.User;

public class UserRn {
	
	private UserDao dao;
	
	public UserRn(){
		dao=new UserDao();
	}
	
	public void salvar (User user) throws Exception{
		if(user.getNome().trim().isEmpty()){
			throw new Exception("O nome é obrigatório");
		}
		if(user.getEndereco().trim().isEmpty()){
			throw new Exception("O endereço é obrigatório");
		}
		if(user.getProfissao().trim().isEmpty()){
			throw new Exception("A profissao é obrigatorio");
		}
		if(user.getCidade().trim().isEmpty()){
			throw new Exception("A cidade é obrigatorio");
		}
		dao.salvar(user);
	}
	
	public List<User> listar(){
		return dao.listarTodos();
	}
	
	public User buscarPorId(Long id){
		return dao.buscarPorId(id);
	}
	
	public void excluir (Long id) throws Exception{
		dao.excluir(id);
	}
}
