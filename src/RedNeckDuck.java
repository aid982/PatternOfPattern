
public class RedNeckDuck implements Quackable {
	Observable observable;

	@Override
	public void quack() {
		System.out.println("rnd quack");
		notifyObservers();
		
	}

	@Override
	public void registerObserver(Observer observer) {
		 observable.registerObserver(observer);
		
	}

	public RedNeckDuck() {
		super();
		observable = new Observable(this);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
		
	}
	

}
