public class Monster extends Character {

	public Monster (int lifePoint, int xPos, int yPos, int speed,int direction,ImageAnimeDirection image)
	{
		super (lifePoint, xPos, yPos, speed, direction,image);
	}
	
	public void moveUp ()
	{
		setYPos(yPos + getFrozen()*1);
		direction = 1;
	}

	public void moveDown ()
	{
		setYPos(yPos - getFrozen()*1);
		direction = 2;
	}

	public void moveRight ()
	{
		setXPos(xPos + getFrozen()*1);
		direction = 3;
	}

	public void moveLeft ()
	{
		setXPos(xPos - getFrozen()*1);
		direction = 4;
	}
	
	public void dealDamage(Link link)
	{
		link.setLifePoint(link.getLifePoint() - 1);
	}
	
	//IA
}
