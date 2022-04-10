package br.com.fiap.bean;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import br.com.fiap.dao.AccountDao;
import br.com.fiap.model.Account;

@Named
@RequestScoped
public class AccountBean {

	private Account account = new Account();
	private List<Account> listAccount;
	
	public AccountBean() {
		this.listAccount = list();
	}
	
	public void save() {
		System.out.println("Criado");
		new AccountDao().createAccount(account);
	}
	
	public List<Account> list() {
		List<Account> list = new AccountDao().listarAccount();
		System.err.println(list);
		return list;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Account> getListAccount() {
		return listAccount;
	}

	public void setListAccount(List<Account> listAccount) {
		this.listAccount = listAccount;
	}

}
