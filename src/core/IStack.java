package core;

public interface IStack {
	boolean isFull();
	boolean isEmpty();
	int getSize();
	void push(Object Elm);
	Object Top();
	Object Pop();
}
