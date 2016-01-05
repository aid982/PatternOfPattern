
public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	Quackable CreateMallardDuck() {		
		return new QuackCounter(new MallardDuck());
	}

	@Override
	Quackable CreateRedNeckDuck() {
		return new QuackCounter(new RedNeckDuck());
	}
	@Override
	Quackable CreateGoose() {
		return new QuackCounter(new GooseAdapter(new Goose()));
		
	}
	

}
