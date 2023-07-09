package agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

public class WearhouseManagementClass extends Agent{
	
	protected void setup() {
        
        // Comportements sp�cifiques � l'agent gestionnaire de t�ches
        addBehaviour(new CyclicBehaviour(this) {
            public void action() {
                // Logique du comportement de l'agent gestionnaire de t�ches
                
                // Exemple de r�ception d'une nouvelle t�che
                receiveTask();
                
                // Exemple d'affectation d'une t�che � un robot
                assignTask();
            }
        });
    }
    
    private void receiveTask() {
        // Logique de r�ception d'une nouvelle t�che
    }
    
    private void assignTask() {
        // Logique d'affectation d'une t�che � un robot
    }

}
