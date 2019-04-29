package message;

/**
 * 此JAVABEAN代表留言板的数据
 */
public class MessageVO implements java.io.Serializable {
	private String name, email, title, content;

	private java.sql.Date date;

	// setter or getter
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return this.name;
	}

	public String getContent() {
		return this.content;
	}

	public String getTitle() {
		return this.title;
	}

	public String getEmail() {
		return this.email;
	}

	public java.sql.Date getDate() {
		return this.date;
	}

	public void setDate(java.sql.Date date) {
		this.date = date;
	}

}
