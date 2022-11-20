package entity;

public class CategoryQuestion {

	private int id;

	private String name;

	public CategoryQuestion() {
	}

	public CategoryQuestion(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "CategoryQuestion{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
