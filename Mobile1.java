class Mobile1 
{
	String model;
	long price;
	SmCard s;
	Mobile1(String model,long price)
	{
		this.model=model;
		this.price=price;
	}
	public void removeSim()
	{
		if(s!=null)
		{
			s=null;
			System.out.println("Sim Card is Removed Successfully");
		}
		else
		{
			System.out.println("Sim is not present -- What to remove anna");
		}
	}
	public void insertSim(SmCard s) ////
	{
		if(this.s==null)
		{
			this.s=s;
			System.out.println("Sim Card inserted successfully");
		}
		else
		{
		System.out.println("Sim Card is Already Present");
		}
	}
	public void getMobDetails()
	{
		System.out.println("mobile model is ------"+model);
		System.out.println("Mobile Price is -------"+price);
		if(s!=null)
		{
			s.getSimDetails();
		}
		else
		{
			System.out.println("Sim is Not present What to access");
		}
	}
}
