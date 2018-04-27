package helloworldmvc.main;

import helloworldmvc.controller.Controller;
import helloworldmvc.view.View;
import helloworldmvc.model.Model;

public abstract class Main {

	public static void main(String[] args) {
		Controller controller = new Controller( new View(), new Model() );
		controller.run();
	}

}
