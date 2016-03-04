package internals;

import java.util.*;

/**
 * 
 * @author Owner
 *
 */
public abstract class Event 
{
	protected ArrayDeque<Participant> waiting = new ArrayDeque<Participant>();
	protected ArrayDeque<Participant> running = new ArrayDeque<Participant>();
	protected ArrayList<Participant> placement = new ArrayList<Participant>();
	
	public boolean addToWaiting(int bib) 
	{
		return waiting.add(new Participant(bib));
	}
	
	public boolean waitingToRunning()
	{
		// removeFirst() throws NoSuchElementException if waiting is empty
		return running.add(waiting.removeFirst());
	}
	
	public boolean runningToPlacement()
	{
		// removeFirst() throws NoSuchElementException if running is empty
		return placement.add(running.removeFirst());
	}
	
	public void dnf()
	{
		running.removeFirst(); //Runner DNF and is no longer a participant 
	}
	
	public abstract String toString(); //event name
	
	public abstract void falseStart(); //"CANCEL" 
	
	
	
}
