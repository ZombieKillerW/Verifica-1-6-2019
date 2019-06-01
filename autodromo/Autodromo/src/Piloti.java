import java.util.HashMap;

public class Piloti 
{
	private HashMap<Integer,Pilota> piloti=new HashMap<Integer,Pilota>();
	
	public void addPilota(Pilota p)
	{
		piloti.put(p.getNumero(), p);
	}
	
	public void deletePilota(int n)
	{
		if(piloti.containsKey(n))
		{
			piloti.remove(n);
		}
	}
	
	public Tempo migliorTempoAssoluto()
	{
		Tempo t=new Tempo(0);
		int i=0;
		for(;i<99;i++)
		{
			if(piloti.containsKey(i))
			{
			if(piloti.get(i).migliorTempo()!=null)
			{
				t=piloti.get(i).migliorTempo();
				break;
			}
			}
		}
		for(;i<99;i++)
		{
			if(piloti.containsKey(i)){
				if(piloti.get(i).migliorTempo().getTempo()<t.getTempo() && (piloti.get(i).migliorTempo()!=null))
				{
					t=piloti.get(i).migliorTempo();
				}
			}}
		return t;
		}
	
	public Pilota ricercaPilota(int n)
	{
		return piloti.get(n);
	}
}
