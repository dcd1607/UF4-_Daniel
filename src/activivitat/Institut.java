package activivitat;

public class Institut {
	private String nom;
	private Alumne [] llista_Alumnes;
	private int num;
	private int cont_Alumnes = 100;
	
	public Institut(String nom) {
		this.nom=nom;
		this.llista_Alumnes = new Alumne [100];
		this.cont_Alumnes = 0;
	}
	
	public Institut(String nom, int max) {
		this.nom=nom;
		this.llista_Alumnes = new Alumne [max];
		this.cont_Alumnes = 0;
	}
	
	public void afegir_Alumnes(Alumne nom) {
		this.llista_Alumnes [cont_Alumnes] = nom;
		this.cont_Alumnes++;
	}

	public int getCont_Alumnes() {
		return cont_Alumnes;
	}

	public void setCont_Alumnes(int cont_Alumnes) {
		this.cont_Alumnes = cont_Alumnes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Alumne[] getLlista_Alumnes() {
		return llista_Alumnes;
	}

	public void setLlista_Alumnes(Alumne[] llista_Alumnes) {
		this.llista_Alumnes = llista_Alumnes;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	

}
