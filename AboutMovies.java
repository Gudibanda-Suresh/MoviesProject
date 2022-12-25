package MoviesProject;

public class AboutMovies {
	public static void main(String[]ag) {
		
		TheatreOwners to=new TheatreOwners();
		to.rights(new HollyWood());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		to.rights(new TollyWood());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		to.rights(new BollyWood());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		to.ASSA(new TollyWood());
		
		
		
		
	}

}
