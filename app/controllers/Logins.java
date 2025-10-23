package controllers;

import models.Operador;
import models.Usuario;
import models.Veterinario;
import play.data.validation.Required;
import play.data.validation.Valid;
import play.mvc.Controller;

public class Logins extends Controller {

	public static void form(){
    render();
	}
	
	
	//@valided é para objetos complexos vindos de modelos
	public static void logar (@Required String login, @Required String senha) {

		
		if(validation.hasErrors()) {
			params.flash();
			validation.keep(); // Segurar os dados na nova requisição!
			form();
		}
		
		Usuario usuario = Usuario.find("login = ?1 and senha = ?2", login,senha).first();
		
		
	        if(usuario == null) {
			flash.error("Login ou senha inválidos");
			form();
			
		}else {
			session.put("usuarioLogado", usuario.login);
			session.put("usuarioPerfil", usuario.perfil.name());
			flash.success("Logado com sucesso");
			Animais.listar(null);
		}
		
	}
	
	public static void logout() {
		session.clear();
		flash.success("Você saiu do sistema!");
		form();
	}
	
}
