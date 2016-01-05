import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// Composite pattern
public class Flock implements Quackable {
	List<Quackable> quackables = new ArrayList<>();	
	
	public void add(Quackable quacker){
		quackables.add(quacker);
	}
	
	public void quack() {
		Iterator<Quackable> iterator = quackables.iterator();
		while(iterator.hasNext()){
			Quackable quacker = iterator.next();
			quacker.quack();			
		}
		
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = quackables.iterator();
		while(iterator.hasNext()){
			Quackable quacker = iterator.next();
			quacker.registerObserver(observer);			
		}		
	}

	@Override
	public void notifyObservers() {		
	}

	public Flock() {
		super();		
	}
	
	
	
	

}
