package es.upm.miw.mastermind.models;

class Attempt {

	private int value = 0;

	public Attempt() {
		value = 0;
	}

    public int take() {
        return value;
    }

    public void clear() {
	    this.value = 0;
    }

    boolean spentAttempts(int maxAttempts) {
	    return this.take() == maxAttempts;
    }

    public void up() {
    	value += 1;
    }

}
