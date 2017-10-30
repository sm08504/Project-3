package assignment;

public interface BasketballStats {

	public int getNumGamesStarted();
	
	public void setNumGamesStarted(int gamesStarted);

	public double calcGamesStartedPercentage();

	public int getFieldGoalsAttempted(); 

	public void setFieldGoalsAttempted(int fieldGoalsAttempted);

	public int getFieldGoalsMade(); 

	public void setFieldGoalsMade(int fieldGoalsMade);

	public double calcFieldGoalPercentage();

}
