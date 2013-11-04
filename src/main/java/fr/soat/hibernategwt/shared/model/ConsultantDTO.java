package fr.soat.hibernategwt.shared.model;

import java.io.Serializable;

import fr.soat.hibernategwt.server.model.Gps;

public class ConsultantDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idConsultant;
	private String nom;
	private Gps gps;

	public ConsultantDTO(int idConsultant, String nom, Gps gps) {
		super();
		this.idConsultant = idConsultant;
		this.nom = nom;
		this.gps = gps;
	}

	public ConsultantDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getIdConsultant() {
		return idConsultant;
	}

	public void setIdConsultant(int idConsultant) {
		this.idConsultant = idConsultant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Gps getGps() {
		return gps;
	}

	public void setGps(Gps gps) {
		this.gps = gps;
	}

}