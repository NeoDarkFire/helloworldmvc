package helloworldmvc.model;

public class Model {

	public String getHelloWorld() {
		return DAOHelloWorld.getInstance().getHelloWorldMessage();
	}

}
