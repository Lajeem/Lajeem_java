package String;

import java.util.Arrays;


public class Chocolate implements Comparable<Chocolate>
{
	private String name ;
	private String flavour;
	private int rs;
	private int gram;
	private String made_in;
	
	public Chocolate(String name, String flavour, int rs, int gram, String made_in) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.rs = rs;
		this.gram = gram;
		this.made_in = made_in;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getRs() {
		return rs;
	}

	public void setRs(int rs) {
		this.rs = rs;
	}

	public int getGram() {
		return gram;
	}

	public void setGram(int gram) {
		this.gram = gram;
	}

	public String getMade_in() {
		return made_in;
	}

	public void setMade_in(String made_in) {
		this.made_in = made_in;
	}

	@Override
	public String toString() {
		return "Chocolate [name=" + name + ", flavour=" + flavour + ", rs=" + rs + ", gram=" + gram + ", made_in="
				+ made_in + "]";
	}
	
	public static void main(String[] args) 
	{
		Chocalate c1=new Chocalate("Gallexy","Smooth",2,5,"india");
		Chocalate c2=new Chocalate("Dairy milk","oreo",890,400,"Saudi");
		Chocalate c3=new Chocalate("Kit kat","bite",20,15,"india");
		Chocalate c4=new Chocalate("Cloud 9","Choco",63,25,"Malaysia");
		Chocalate c5=new Chocalate("Waffer","White chocolate",47,25,"Dubai");
	}

	@Override
	public int compareTo(Chocolate o) 
	{
		if(this.getFlavour()>o.getFlavour())
		{
			return 1;
		}
		
		
		
		
		
		
		return 0;
	}
	
		
	
}
