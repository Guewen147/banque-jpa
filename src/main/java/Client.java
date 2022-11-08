
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CLIENT")
public class Client {
	
	@ManyToOne
	@JoinColumn(name ="ID_BANQUE")
	private Banque banque;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NOM" , length = 20 , nullable = false)
	private String nom;
	
	@Column(name = "PRENOM" , length = 20 , nullable = false)
	private String prenom;

	@Column(name = "DATENAISSANCE" , length = 20 , nullable = false)
	private LocalDate dateNaissance;
	
	@Embedded
	private Adresse adresse;
	
	@ManyToMany
	@JoinTable(name = "LIEN_CLIENT_COMPTE",
				uniqueConstraints = @UniqueConstraint (columnNames = { "ID_COM", "ID_CLI" }),
				joinColumns = @JoinColumn(name= "ID_COM" , referencedColumnName ="ID"),
				inverseJoinColumns = @JoinColumn(name= "ID_CLI", referencedColumnName = "ID"))
	private  List<Compte> comptes = new ArrayList<Compte>();

	/**
	 * 
	 */
	public Client() {
		super();
	}

	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	

	/**
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**
	 * @param banque the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/**
	 * @return the comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
	
}
