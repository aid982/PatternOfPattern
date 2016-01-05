// Decorator class 
public class QuackCounter implements Quackable {
	Quackable duck;	
	static int countQuack;	
	public void quack() {
		duck.quack();
		countQuack++;
	}
	
	
	@Override
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
		
	}


	@Override
	public void notifyObservers() {
		duck.notifyObservers();

		
	}


	public QuackCounter(Quackable duck) {
		super();
		this.duck = duck;		
	}

	public static int getQuackCount(){
		return countQuack;
	}
	
	
	

}
