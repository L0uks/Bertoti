
public class Games {
	private String nome;
	private String genero;
	private Plataforma plataforma;
	private Double valor;
	
	
	
	public Games(String nome, String genero, Plataforma plataforma, Double valor) {
		this.nome = nome;
		this.genero = genero;
		this.plataforma = plataforma;
		this.valor = valor;
	}
	public  String getNome() {
		return nome;
		
	}
	public void  setNome(String nome) {
		this.nome = nome;
		
	}
	public String getGenero() {
		return genero;
		
	}
	public void setGenero(String genero) {
		this.genero = genero;
		
	}
	public Plataforma getPlataforma() {
		return plataforma;
		
	}
	public void setPlataforma(Plataforma nova ) {
		this.plataforma = nova;
		
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
		
	}
	
		

}
