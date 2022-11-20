package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {

	private int id;

	private String name;

	private Account creator;

	private LocalDate createDate;

	private Account[] accounts;

	private  String [] username;
	;// Lưu trữ nhưng account thuộc 1 group
	//a) không có parameter
	public Group() {
	}

	//b) Có các parameter là GroupName, Creator, array Account[]
	//accounts, CreateDate

	public Group(String name, Account creator, LocalDate createDate, Account[] accounts) {
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}

	public Group(int id, String name, Account creator, LocalDate createDate, Account[] accounts, String[] username) {
		this.id = id;
		this.name = null;
		this.creator = null;
		this.createDate = null;
		this.accounts = null;
		this.username = username;
	}
//c) Có các parameter là GroupName, Creator, array String[]
	//usernames , CreateDate
	//Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
	//username, các thông tin còn lại = null).

	public Group(int id, String name, Account creator, LocalDate createDate, Account[] accounts) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		String accs="[ ";
		for (int i = 0; i < accounts.length; i++) {
			if (i == accounts.length-1){
				accs+= accounts[i].getId();
			}else {
				accs += accounts[i].getId() +",  ";
			}
		}
		accs+=" ]";

		return "Group{" +
				"id=" + id +
				", name='" + name + '\'' +
				", creator=" + creator.getFullName() +
				", createDate=" + createDate +
				", accounts=" + accs +
				'}';
	}
}
