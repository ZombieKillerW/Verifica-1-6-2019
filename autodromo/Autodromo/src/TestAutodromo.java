
public class TestAutodromo {

	public static void main(String[] args) 
	{
		Piloti p=new Piloti();
		p.addPilota(new Pilota("gabriele",9));
		p.addPilota(new Pilota("gabriele",20));
		p.ricercaPilota(9).addTempo(new Tempo(110));
		p.ricercaPilota(20).addTempo(new Tempo(90));
		System.out.println(p.migliorTempoAssoluto().getTempo());

	}

}
