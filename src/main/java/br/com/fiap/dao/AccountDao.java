package br.com.fiap.dao;

import java.util.List;

import javax.persistence.*;

import br.com.fiap.model.Account;

public class AccountDao {

	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
	EntityManager em = fabrica.createEntityManager();
	
	public void createAccount(Account account) {

		try {
			em.getTransaction().begin();
			em.persist(account);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			em.clear();
			em.close();
		}

	}
	
	public List<Account> listarAccount(){
		TypedQuery<Account> returnAccountList = em.createQuery("select a from Account a", Account.class);
		return returnAccountList.getResultList();
	}

}
