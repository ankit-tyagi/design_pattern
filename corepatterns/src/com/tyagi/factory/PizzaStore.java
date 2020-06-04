package com.tyagi.factory;

public class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza p = null;
		
		if(type.equals("cheese")) {
			p = new CheesePizza();
		}else if(type.equals("chicken")) {
			p = new ChickenPizza();
		}else if(type.equals("veggie")) {
			p = new VeggiePizza();
		}
		
		p.prepare();
		p.bake();
		p.cut();
		
		return p;
	}

}
