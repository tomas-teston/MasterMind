package es.upm.miw.mastermind.controllers;
import es.upm.miw.mastermind.models.Combination;

public interface ConfigurationSecretController extends OperationController {

	void configurationSecret(Combination secret);

	Error isCorrectCombinationSecret();

	void start();

}
