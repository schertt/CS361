package internals;


public class Individual extends Event {

	@Override
	public String toString() {
		return "IND: Individual ";
	}

	@Override
	public void falseStart() {
		for(int i=0; i<running.size(); ++i) {
			Participant invalidRunner = running.removeFirst(); //remove all players from running queue
			waiting.add(invalidRunner); //add removed player into waiting queue again
		}
	}
	
}
