package entity;

public class Position {

	public int id;

	public PositionName name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PositionName getName() {
		return name;
	}

	public void setName(PositionName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Position{" +
				"id=" + id +
				", name=" + name +
				'}';
	}

}
