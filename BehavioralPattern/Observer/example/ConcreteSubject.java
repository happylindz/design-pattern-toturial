class ConcreteSubject extends Subject {
	private int subjectState;
	public int getState() {
		return subjectState;
	}
	public void setState(int newState) {
		subjectState = newState;
		System.out.println("subject' state change to " + newState);
		this.notifyObserver(subjectState);
	}
}