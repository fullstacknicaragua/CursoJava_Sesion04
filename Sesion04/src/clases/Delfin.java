package clases;

import interfaces.*;

public class Delfin implements IAnimal {

	@Override
	public void comunicar() {
		// TODO Auto-generated method stub
		System.out.println("emite sonidos!");
	}

	@Override
	public void trasladar() {
		// TODO Auto-generated method stub
		System.out.println("nada!");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("come peces!");
	}

}
