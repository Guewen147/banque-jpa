import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ASSURANCEVIE")
public class AssuranceVie extends Compte {

	
	@Column(name = "DATE_FIN" , length = 20 , nullable = false)
	private LocalDate dateFin;
	
	@Column(name = "TAUX" , length = 20 , nullable = false)
	private double taux;

	/**
	 * 
	 */
	public AssuranceVie() {
	}

	/**
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	
}
