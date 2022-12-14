package packages.commands;

import packages.app.CollectionManager;
import packages.app.Server;
import packages.data.HumanBeing;
import packages.util.Response;
import packages.util.UserInfo;

/**
 * AddIfMin class
 */
public class AddIfMin implements Command{
    private final CollectionManager collectionManager;

    public AddIfMin(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    /**
     * Add an element if it is smaller than the smallest existing one
     *
     * @param args     arguments for command
     * @param object
     * @param response
     */
    @Override
    public void execute(String args, HumanBeing object, UserInfo userInfo, Response response) {
        if(!collectionManager.addIfMin(object, userInfo.getUser())) {
            response.setSuccess(false);
        }
        Server.sendResponse(response, response.getKey());
    }

    @Override
    public String toString() {
        return "add_if_min - добавляет элемент, если он меньше чем наименьший элемент коллекции";
    }

}
