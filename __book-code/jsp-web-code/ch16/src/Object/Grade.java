package Object;


public class Grade {

	private int id;

	private String name;

	private Grade() {

	}

	private Grade(int id, String name) {
		this.id = id;

		this.name = name;
	}

	public static Grade getInstance() {
		return new Grade();
	}

	public static Grade getInstance(int id, String name) {
		return new Grade(id, name);
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
