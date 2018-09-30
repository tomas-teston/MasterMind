package es.upm.miw.mastermind.views.console;

import es.upm.miw.mastermind.controllers.CombinationControllerVisitor;
import es.upm.miw.mastermind.controllers.CombinationController;
import es.upm.miw.mastermind.models.Combination;

abstract class ColocateCombinationView implements CombinationControllerVisitor {

    private CombinationController combinationController;

    protected ColocateCombinationView(CombinationController combinationController){
        assert combinationController != null;
        this.combinationController = combinationController;
    }

    abstract Combination getCombination();

    protected void show(String infix, Combination combination){
        new CombinationView(infix + " ", combination).write();
    }

    protected CombinationController getCombinationController(){
        return combinationController;
    }
}
