package Job;

import models.Operador;
import models.Perfil;
import models.Tutor;
import models.Usuario;
import models.Veterinario;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Inicializador extends Job {

	@Override
	public void doJob() {

		if (Tutor.count() == 0) {

			Tutor joao = new Tutor();
			joao.nome = "João da Silva";
			joao.cpf = "12345678909";
			joao.save();

			Tutor Maria = new Tutor();
			Maria.nome = "Maria da Silva";
			Maria.cpf = "98765432107";
			Maria.save();
		}

		if (Veterinario.count() == 0) {
			
			Usuario usuarioMarina = new Usuario();
			usuarioMarina.login = "MarinaEllen";
			usuarioMarina.senha = "0105";
			usuarioMarina.perfil = Perfil.VETERINARIO;
			usuarioMarina.save();

			Veterinario Marina = new Veterinario();
			Marina.nome = "Marina Ellen Ida";
			Marina.usuario = usuarioMarina;
			Marina.crm = "32165497";
			Marina.save();
			
			Usuario usuarioEmanuel = new Usuario();
			usuarioEmanuel.login = "AroldoEmanuel";
			usuarioEmanuel.senha = "5050";
			usuarioEmanuel.perfil = Perfil.VETERINARIO;
			usuarioEmanuel.save();

			Veterinario Emanuel = new Veterinario();
			Emanuel.nome = "Aroldo Emanuel";
			Emanuel.crm = "98765432107";
			Emanuel.usuario = usuarioEmanuel;
			Emanuel.save();
		}
		
		if(Operador.count() == 0) {
			
			Usuario usuarioAnitta = new Usuario();
			usuarioAnitta.login = "AnittaLouyse";
			usuarioAnitta.senha = "2222";
			usuarioAnitta.perfil = Perfil.OPERADOR;
			usuarioAnitta.save();
			
			Operador Anitta = new Operador();
			Anitta.email = "AnittaLouyse@gmail.com";
			Anitta.usuario = usuarioAnitta;
			Anitta.save();
			
			
			Usuario usuarioRamon = new Usuario();
			usuarioRamon.login = "RamonSantos";
			usuarioRamon.senha = "1111";
			usuarioRamon.perfil = Perfil.OPERADOR;
			usuarioRamon.save();
			
			Operador Ramon = new Operador();
			Ramon.email = "Ramon@gmail.com";
			Ramon.usuario = usuarioRamon;
			Ramon.save();
			
		}
		
		
	}

}
