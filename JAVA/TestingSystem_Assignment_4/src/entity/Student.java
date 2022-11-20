package entity;

public class Student extends Person {

	//Exercise 4 : Encapsulation
	//Question 1:
	//Tạo Object Student có các property id, name, hometown, điểm học lực
	//a) Tất cả các property sẽ để là private để các class khác không
	//chỉnh sửa hay nhìn thấy


	private int id;
	private String name;
	private String hometown;
	private int diemHL = 7;

	public Student() {
	}

	public Student(int id, String name, String hometown) {
		this.id = id;
		this.name = name;
		this.hometown = hometown;

	}
	public Student(String name, Integer age, String hometown, int diemHL) {
		super(name, age);
		this.hometown = hometown;
		this.diemHL = diemHL;
	}
	public Student(int id, String name, String hometown, int diemHL) {
		this.id = id;
		this.name = name;
		this.hometown = hometown;
		this.diemHL = diemHL ;
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

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public int getDiemHL() {
		return diemHL;
	}

	public void setDiemHL(int diemHL) {
		this.diemHL = diemHL;
	}
// tạo 1 method để nhập điểm nè
	public void setdiemHL(int diemHL) {
		this.diemHL = diemHL;
	}
// tạo 1 method để công dồn điểm
	public void SumDiemHL(int diemHL) {
		this.diemHL = this.diemHL + diemHL;
	}
	@Override
	public String toString() {

		String Xeploai = null;
		if (this.diemHL < 4) {
			System.out.println("bạn này học lại cho chắc cú");
			Xeploai = "Yếu";
		} else if (this.diemHL > 4 && this.diemHL < 6) {
			System.out.println("bạn này vừa đủ điểm qua môn");
			Xeploai = "Trung bình";
		} else if (this.diemHL > 6 && this.diemHL < 8) {
			System.out.println("bạn này học khá tốt ");
			Xeploai = "Khá ok ";
		}else {
			System.out.println("bạn này học giỏi nèkkk ");
			Xeploai = "Giỏi";
		}






		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", hometown='" + hometown + '\'' +
				", diemHL= " + diemHL +"Xếp Loại :"+ Xeploai +
				'}';
	}

	//b) Tạo constructor cho phép khi khởi tạo mỗi student thì người
	//dùng sẽ nhập vào tên, hometown và có điểm học lực = 0
	//c) Tạo 1 method cho phép set điểm vào
	//d) Tạo 1 method cho phép cộng thêm điểm
	//e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên,
	//điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm >
	//4.0 và < 6.0 thì sẽ in ra là trung bình, nếu điểm > 6.0 và < 8.0
	//thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
	//Demo các chức năng trên bằng class ở front-end.
}
