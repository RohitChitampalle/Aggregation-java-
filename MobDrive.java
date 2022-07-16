class MobDrive 
{
	public static void main(String[] args) 
	{
		Mobile1 apple= new Mobile1("Iphone14",120000);
		apple.insertSim(new SmCard(961123923,"Jio"));
		apple.removeSim();
		apple.getMobDetails();
	}
}
