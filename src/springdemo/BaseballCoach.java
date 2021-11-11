package springdemo;

public class BaseballCoach implements Coach {
		
	//Define a private field for the dependency
	private FortuneService fs;
	
	// Define constructor for the dependency function
	public BaseballCoach(FortuneService theFortuneService) {
		fs = theFortuneService;
	}
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	@Override
	public String getDailyFortune() {
		
		// Use my fortuneSerive to get a fortune
		return null;
	}
	
}
 