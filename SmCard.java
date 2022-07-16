class SmCard
{
private int simNumber;
String serviceProvider;
SmCard(int sno,String sp)
	{
		this.simNumber=sno;
		this.serviceProvider=sp;
	}
	public int getSno()
	{
		return simNumber;
	}
	public String getSp()
	{
		return serviceProvider;
	}
	public void  getSimDetails()
	{
		System.out.println("Sim Number is -----"+simNumber);
		System.out.println("Sim Service Provider-----"+serviceProvider);
	}
}  


