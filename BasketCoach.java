package springdemo;

public class BasketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new fields for emailAddress and team
	private String emailAddress;
	private String team; 
	
	//create a no argument constructor
	public BasketCoach() {
		System.out.println("BasketCoach inside no-arg constructor");
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("BasketCoach inside setter method setEmailAddress ");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("BasketCoach inside setter method setTeam");
		this.team = team;
	}



	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("BasketCoach inside setter method setFortuneService ");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice 15 minutes of triple shots";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
