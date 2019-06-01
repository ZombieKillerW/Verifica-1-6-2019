import java.util.ArrayList;

public class Pilota 
{
	private String nome;
	private int numero;
	private ArrayList<Tempo> tempi =new ArrayList<Tempo>();
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public int getNumero() 
	{
		return numero;
	}
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	
	public void addTempo(Tempo t)
	{
		tempi.add(t);
	}
	
	public Pilota(String nome,int numero)
	{
		this.nome=nome;
		this.numero=numero;
	}
	
	public Tempo migliorTempo()
	{
		Tempo t=tempi.get(0);
		for(int i=1;i<tempi.size();i++)
		{
			if(tempi.get(i).getTempo()<(t.getTempo()))
			{
				t=tempi.get(i);
			}
		}
		return t;
	}
	@Override
	public String toString() {
		return "Pilota [nome=" + nome + ", numero=" + numero + ", tempi=" + tempi + "]";
	}
	
	
	
	
	
			
	
}
