package es.upm.miw.mastermind.views.console;

import java.util.Collections;

import es.upm.miw.mastermind.controllers.ConfigurationSecretController;
import es.upm.miw.mastermind.models.Combination;
import es.upm.miw.mastermind.utils.IO;
import es.upm.miw.mastermind.controllers.Error;

class ConfigurationSecretView {

	private IO io = new IO();

	void interact(ConfigurationSecretController configurationSecretController){
		//String secret = new LimitedStringDialog("Introduce secreto: [4 letras: A (amarillo), R (rojo), V (verde), Z (azul)] ", 1, 4).read();
		configurationSecretController.configurationSecret(new Combination().random());
		Error error = configurationSecretController.isCorrectCombinationSecret();
		if (error == null) {
			io.writeln("Secreto: " + String.join("", Collections.nCopies(Combination.DIMENSION, "*")));
			configurationSecretController.start();
		} else {
			io.writeln("" + error);
		}
	}
}
