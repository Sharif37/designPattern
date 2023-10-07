package Composite;

import java.util.ArrayList;
import java.util.List;

public class group implements component {
	public List<component> components = new ArrayList<component>();

	public void add(component component) {
		components.add(component);
	}

	public void render() {
		for (var component : components) {
			component.render();

		}
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		for (var component : components) {
			component.move();

		}
	}
}
