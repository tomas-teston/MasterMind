package es.upm.miw.mastermind.controllers;

public enum Error {

	COMBINATION_ERROR("La combinación es erronea");

	private String message;

	private Error(String message){
		this.message = message;
	}

	@Override
	public String toString(){
		return message;
	}
}
