package core;

import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Object>Elms;
	public Stack() {
		Elms = new ArrayList<>();
	}
	
	public boolean isFull() {
		return false;
	}
	
	public boolean isEmpty() {
		return Elms.isEmpty();
	}

	public int getSize() {
		if (Elms !=null)
			return Elms.size();
		else 
			return 0;
	}
	
	public void push(Object Elm) {
		Elms.add(Elm);
	}
	
	public Object Top() {
		return Elms.get(getSize()-1);
	}

	public Object Pop() {
		return Elms.remove(Elms.size()-1);
	}
}
