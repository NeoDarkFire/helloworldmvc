package helloworldmaven.model;

import helloworldmvc.contract.IModel;

public class Model implements IModel {

	public String getHelloWorld() {
		return DAOHelloWorld.getInstance().getHelloWorldMessage();
	}

}
