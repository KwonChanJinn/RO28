package entity;

import java.time.LocalDate;

public class Group {

	public int id;

	public String name;

	public Account creator;

	public LocalDate createDate;

	public Account[] accounts; // Lưu trữ nhưng account thuộc 1 group

}
