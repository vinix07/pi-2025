package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Usuario extends Model{
	
	@Required
	public String login;
	@Required
	@Min(4)
	public String senha;

	@Enumerated(EnumType.STRING)
	public Perfil perfil;
	

}
