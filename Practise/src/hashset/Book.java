package hashset;

import java.util.Objects;

public class Book {
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author,String publisher,int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		}
	@Override
	public int hashCode() {
		return Objects.hash(author, id, name, publisher, quantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(publisher, other.publisher) && quantity == other.quantity;
	}

}
