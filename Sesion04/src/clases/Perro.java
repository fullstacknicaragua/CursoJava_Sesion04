package clases;

import interfaces.*;

public class Perro implements IAnimal {

	@Override
	public void comunicar() {
		// TODO Auto-generated method stub
		System.out.println("ladra!");
	}

	@Override
	public void trasladar() {
		// TODO Auto-generated method stub
		System.out.println("camina!");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("come huesos!");
	}

}
