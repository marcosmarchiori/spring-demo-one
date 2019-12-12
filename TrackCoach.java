package springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it! " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartConfig() {
		System.out.println("TrackCoach: inside method doMyStartConfig");
	}
	
	// add a destroy method
	public void doMyCleanupConfig() {
		System.out.println("TrackCoach: inside method doMyCleanupConfig");
	}
}
