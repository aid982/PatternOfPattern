
public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator duckSimulator = new DuckSimulator();
		AbstractDuckFactory  duckFactory = new CountingDuckFactory();
		duckSimulator.simulate(duckFactory);
		
	}
	void simulate(AbstractDuckFactory factory){		
		Quackable mallardDuck =factory.CreateMallardDuck();
		
		Quackable redneckDuck =factory.CreateRedNeckDuck();
		Quackable goose = factory.CreateGoose();		
		Quackologist quackologist = new Quackologist();
		
		
		Flock flock = new Flock();		
		flock.add(mallardDuck);		
		flock.add(redneckDuck);
		flock.add(goose);
		flock.registerObserver(quackologist);
		flock.quack();
		
		
		
		System.out.println(QuackCounter.getQuackCount());
	}
	
	void simulate(Quackable duck){
		duck.quack();
	}

}
