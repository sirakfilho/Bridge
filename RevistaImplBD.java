package modelo;
import visao.Revista;
import visao.PublicacaoImplement;;

public class RevistaImplBD extends Revista{
	
	private String titulo;
	
	private String autor;
	
	private String isbn;
	
	//Contrutor

	public RevistaImplBD(PublicacaoImplement g, String titulo, String autor, String isbn) {
		super(g);
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}

	
	//ToString
	
	@Override
	public String toString() {
		return "RevistaImplBD [Pos Verdade=" + titulo + ", Matthew D�Ancona=" + autor + ", 978 85 68941 05 8=" + isbn + "]";
	}
	
	
	
	//Get e Set

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
