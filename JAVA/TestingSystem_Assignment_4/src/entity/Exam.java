package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Exam {

	private int id;

	private String code;

	private String title;

	private CategoryQuestion[] category;

	private int duration;

	private Account creator;

	private LocalDate createDate;

	private Question[] question;

	public Exam() {
	}

	public Exam(int id, String code, String title, CategoryQuestion[] category, int duration, Account creator, LocalDate createDate, Question[] question) {
		this.id = id;
		this.code = code;
		this.title = title;
		this.category = category;
		this.duration = duration;
		this.creator = creator;
		this.createDate = createDate;
		this.question = question;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CategoryQuestion[] getCategory() {
		return category;
	}

	public void setCategory(CategoryQuestion[] category) {
		this.category = category;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
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

	public Question[] getQuestion() {
		return question;
	}

	public void setQuestion(Question[] question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Exam{" +
				"id=" + id +
				", code='" + code + '\'' +
				", title='" + title + '\'' +
				", category=" + Arrays.toString(category) +
				", duration=" + duration +
				", creator=" + creator +
				", createDate=" + createDate +
				", question=" + Arrays.toString(question) +
				'}';
	}
}
