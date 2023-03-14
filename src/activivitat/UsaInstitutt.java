package activivitat;

public class UsaInstitutt {

	public static void main(String[] args) {
		
		Institut Jaume = new Institut ("Jaume");
		Institut Narcis = new Institut ("Narcis",3);
		
		Alumne Daniel = new Alumne ("Daniel",18,"77791532N","daniel@gmail.com");
		Alumne Alexis = new Alumne ("Alexis",18,"63956174L","alexis@gmail.com");
		Alumne Sergi = new Alumne ("Sergi",18,"74027592K","sergi@gmail.com");
		Alumne Ismael = new Alumne ("Ismael",19,"76284935J","ismael@gmail.com");
		Alumne Isaac= new Alumne ("Isaac",18,"83069412G","isaac@gmail.com");
		Alumne Josep = new Alumne ("Josep",18,"72963942L","josep@gmail.com");
		
		Jaume.afegir_Alumnes (Alexis);
		Jaume.afegir_Alumnes (Sergi);
		Jaume.afegir_Alumnes (Daniel);
		Narcis.afegir_Alumnes (Ismael);
		Narcis.afegir_Alumnes (Isaac);
		Narcis.afegir_Alumnes (Josep);
		
		for(int x=0; x<3; x++) {
			System.out.println(Jaume.getLlista_Alumnes()[x].getNom()+"	"+ Jaume.getLlista_Alumnes()[x].getEdat()+Jaume.getLlista_Alumnes()[x].getDni()+"	"+Jaume.getLlista_Alumnes()[x].getEmail());
			
		}
		for(int x=0; x<3; x++) {
			System.out.println(Narcis.getLlista_Alumnes()[x].getNom()+"	"+ Narcis.getLlista_Alumnes()[x].getEdat()+Narcis.getLlista_Alumnes()[x].getDni()+"	"+Narcis.getLlista_Alumnes()[x].getEmail());
		}
	}

}
