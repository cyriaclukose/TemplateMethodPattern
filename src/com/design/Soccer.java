package com.design;

public class Soccer extends Game {

	@Override
	public void init() {
		System.out.println(" soccer game initialized");
	}

	@Override
	public void start() {
		System.out.println(" soccer game started -----");
	}

	@Override
	public void end() {
		System.out.println(" soccer game ended ---");
	}

}
