package entity;

import java.time.LocalDate;

public class GroupAccount {

	private int groupId;

	private Account account;

	private LocalDate joinDate;

	public GroupAccount() {
	}

	public GroupAccount(int groupId, Account account, LocalDate joinDate) {
		this.groupId = groupId;
		this.account = account;
		this.joinDate = joinDate;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "GroupAccount{" +
				"groupId=" + groupId +
				", account=" + account +
				", joinDate=" + joinDate +
				'}';
	}
}
