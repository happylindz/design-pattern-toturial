
abstract class Component {
	public abstract void operation();
}

class ConcreteComponent extends Component {
	public void operation(){
		System.out.println("ConcreteComponent say");
	}
}

abstract class Decorator extends Component {
	protected Component component;

	public Decorator(Component component) {
		this.component = component;
	}
	public void operation(){
		component.operation();
	}
}

class ConcreteDecoratorA extends Decorator {
	public ConcreteDecoratorA(Component component){
		super(component);
	}
	private void operationFirst(){
		System.out.println("operationFirst say");
	}
	private void operationLast(){
		System.out.println("operationLast say");
	}
	public void operation() {
		operationFirst();
		super.operation();
		operationLast();
	}
}

public class Client{  
   public static void main(String[] args){  
    Component c1 = new ConcreteComponent ();   
    Decorator decoratorA = new ConcreteDecoratorA(c1);   
    decoratorA .operation();  
    System.out.println("------------------------------------------------");
    Decorator decoratorBandA = new ConcreteDecoratorA(decoratorA);
    decoratorBandA.operation();  
  }  
}  

