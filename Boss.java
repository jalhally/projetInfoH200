
public class Boss extends Monster{	
	
	private String name;
	private boolean rage;

	public Boss (int lifePoint, int xPos, int yPos, int speed,int direction,String name, boolean rage)
	{
		super(lifePoint, xPos, yPos,speed, direction);
		this.name = name;
		this.rage = rage;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public boolean getRage()
	{
		return rage;
	}
	
	public void setRage(boolean rage)
	{
		this.rage = rage;
	}
	
	public void rage() // remplace le skinChange
	{
		setRage(true);
	}
	
	public void fireBall1(Link Link) // pas sur
	{
		FireBall1 fireBall1 = new fireBall1(this.xPos, this.yPos, Link.getXPos(),Link.getYPos());
	}
	
	public void fireBall2()
	{
		FireBall2 fireBall2 = new fireBall2(this.xPos, this.yPos);
	}
	
	public void thunderBolt(Link Link)
	{
		Thunder thunder = new thunder (Link.getXPos(), Link.getYPos());
	}
	
	public void teleportation()
	{
		//random pos
	}
	
	// IA
}

