
public class MallardDuck implements Quackable {
	Observable observable;

	@Override
	public void quack() {
		System.out.println("mlrd quack");
		notifyObservers();
		
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
		
	}

	public MallardDuck() {
		super();
		observable = new Observable(this);

	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mallard duck";
	}
	
	
	

}
