import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BanqueJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
		EntityManager em = emf.createEntityManager();
	
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		
		Banque b1 = new Banque();
		b1.setNom("Banque 1");
		em.persist(b1);
		
		LivretA cpt1 = new LivretA();
		cpt1.setNumero("1A");
		cpt1.setSolde(1203.23);
		cpt1.setTaux(2);
		
		
		AssuranceVie cpt2 = new AssuranceVie();
		cpt2.setNumero("2A");
		cpt2.setSolde(100.23);
		cpt2.setDateFin(LocalDate.of(2042, 02, 02));
		cpt2.setTaux(3);
		
		
		Adresse adr1 = new Adresse();
		adr1.setNumero(12);
		adr1.setRue("Route de l");
		adr1.setCodepostal(56000);
		adr1.setVille("Rennes");
		
		Adresse adr2 = new Adresse();
		adr2.setNumero(12);
		adr2.setRue("rue de la");
		adr2.setCodepostal(29000);
		adr2.setVille("Quimper");
		
		
		Client c1 = new Client();
		c1.setNom("Geminy");
		c1.setPrenom("James");
		c1.setDateNaissance(LocalDate.of(1999, 02, 02));
		c1.setAdresse(adr1);
		c1.setBanque(b1);
		
		
		Client c2 = new Client();
		c2.setNom("Carl");
		c2.setPrenom("Tim");
		c2.setDateNaissance(LocalDate.of(1998,06, 03));
		c2.setAdresse(adr2);
		c2.setBanque(b1);
		
		
		List<Client> clientListe = new ArrayList<Client>();
		clientListe.add(c1);
		clientListe.add(c2);
		
		cpt1.setClients(clientListe);
		
		
		List<Compte> compteClient1 = new ArrayList<Compte>();
		compteClient1.add(cpt2);
		compteClient1.add(cpt1);
		
		c1.setComptes(compteClient1);
		em.persist(c1);
		
		em.persist(c2);
		
		em.persist(cpt1);
		em.persist(cpt2);
		
		
		Virement v1 = new Virement();
		v1.setCompte(cpt1);
		v1.setDate(LocalDateTime.now());
		v1.setMontant(100.4);
		v1.setMotif("cadeau");
		v1.setBeneficiaire("Carl Tim");
		
		Operation o1 = new Operation();
		o1.setCompte(cpt2);
		o1.setDate(LocalDateTime.now());
		o1.setMontant(10.4);
		o1.setMotif("erreur");
		
		em.persist(v1);
		em.persist(o1);
		
		tr.commit();
	}

}
