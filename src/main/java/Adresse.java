import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

	@Column(name = "NUMERO")
	private Integer numero;	
	
	@Column(name = "RUE")
	private String rue;
	
	@Column(name = "CODE_POSTAL")
	private Integer codepostal;
	
	@Column(name = "VILLE")
	private String ville;

	
	
	/**
	 * 
	 */
	public Adresse() {
		super();
	}

	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return the codepostal
	 */
	public Integer getCodepostal() {
		return codepostal;
	}

	/**
	 * @param codepostal the codepostal to set
	 */
	public void setCodepostal(Integer codepostal) {
		this.codepostal = codepostal;
	}


}
