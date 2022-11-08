import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "OPERATION")
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {
	
	@ManyToOne
	@JoinColumn(name ="ID_COMPTE")
	private Compte compte;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "DATE" , length = 20 , nullable = false)
	private LocalDateTime date;
	
	@Column(name = "MONTANT" , length = 20 , nullable = false)
	private double montant;

	@Column(name = "MOTIF" , length = 20 , nullable = true)
	private String motif;
	
	/**
	 * 
	 */
	public Operation() {
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
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}



	/**
	 * @param localDateTime the date to set
	 */
	public void setDate(LocalDateTime localDateTime) {
		this.date = localDateTime;
	}



	/**
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/**
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/**
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/**
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
}
