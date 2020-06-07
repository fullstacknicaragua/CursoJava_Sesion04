package clases;

import interfaces.*;

public class Loro implements IAnimal {

	@Override
	public void comunicar() {
		// TODO Auto-generated method stub
		System.out.println("habla!");
	}

	@Override
	public void trasladar() {
		// TODO Auto-generated method stub
		System.out.println("vuela!");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("come frutas!");
	}

}
