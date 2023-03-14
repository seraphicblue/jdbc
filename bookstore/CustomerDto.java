package bookstore;

public class CustomerDto {

	private String name;

	public CustomerDto() {

	}

	public CustomerDto(String name) {

		this.name = name;

	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CustomerDto [ name=" + name + "]";
	}
}
