package es.upm.miw.mastermind.controllers;
import es.upm.miw.mastermind.controllers.Error;

public interface ConfigurationSecretController extends OperationController {

	void configurationSecret(String secret);

	Error isCorrectCombinationSecret();

	void start();

}
