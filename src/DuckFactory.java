
public class DuckFactory extends AbstractDuckFactory {

	@Override
	Quackable CreateMallardDuck() {		
		return new MallardDuck();
	}

	@Override
	Quackable CreateRedNeckDuck() {
		// TODO Auto-generated method stub
		return new RedNeckDuck();
	}

	@Override
	Quackable CreateGoose() {		
		return new GooseAdapter(new Goose());
	}
	
	

}
