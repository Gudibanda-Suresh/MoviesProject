package MoviesProject;

interface AllWoods1 {
	void RRR();

	void Avatar();

	void Interstellar();

}

class TollyWood1 implements AllWoods1 {

	@Override
	public void RRR() {
		System.out.println("Telugu RRR Movie");
	}

	@Override
	public void Avatar() {
		System.out.println("Telugu Avatar Movie");
	}

	@Override
	public void Interstellar() {
		System.out.println("Telugu Interstellar");
	}

	public void AgentSaiSrinivasAthreya() {													//.....specific Method......
		System.out.println("Telugu AgentSaiSrinivasAthreya Movie");
	}
}

class BollyWood1 implements AllWoods1 {
	@Override
	public void RRR() {
		System.out.println("Hindi RRR Movie");
	}

	@Override
	public void Avatar() {
		System.out.println("Hindi Avatar Movie");
	}

	@Override
	public void Interstellar() {
		System.out.println("Hindi Interstellar");
	}
}

class HollyWood1 implements AllWoods1 {
	@Override
	public void RRR() {
		System.out.println("English RRR Movie");
	}

	@Override
	public void Avatar() {
		System.out.println("English Avatar Movie");
	}

	@Override
	public void Interstellar() {
		System.out.println("English Interstellar");
	}
}

class TheatreOwners1 {
	public void rights(AllWoods1 AW) {
		AW.RRR();
		AW.Avatar();
		AW.Interstellar();
	}

	public void ASSA(AllWoods1 AW) {

		if (AW instanceof TollyWood1) {
			TollyWood1 t = (TollyWood1) AW; //Downcasting
			t.AgentSaiSrinivasAthreya();
			System.out.println("/////////////////////////////////////////////");
			System.out.println(AW instanceof Object);
			System.out.println(AW instanceof AllWoods1);
			System.out.println(AW instanceof TollyWood1);
			System.out.println(AW instanceof BollyWood1);
			

		}

	}
}

public class OneFile {
	public static void main(String[] ag) {

		TheatreOwners1 to = new TheatreOwners1();
		to.rights(new HollyWood1());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		to.rights(new TollyWood1());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		to.rights(new BollyWood1());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		to.ASSA(new TollyWood1());
		//System.out.println("hi");

	}

}
