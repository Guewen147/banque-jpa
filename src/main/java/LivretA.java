import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LIVRETA")
public class LivretA extends Compte{

	@Column(name = "TAUX" , length = 20 , nullable = false)
	private double taux;

	/**
	 * 
	 */
	public LivretA() {
		super();
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
