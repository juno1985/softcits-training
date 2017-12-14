public class BusSpeedMeter extends SpeedMeter
{
	public double getRadius()
	{
		return 0.70;
	}
	public static void main(String[] args)
	{
		BusSpeedMeter csm = new BusSpeedMeter();
		csm.setTurnRate(10);
		System.out.println(csm.getSpeed());
	}
}
