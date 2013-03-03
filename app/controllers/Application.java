package controllers;

import models.Store;
import org.codehaus.jackson.node.ObjectNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }


    public static Result stores() {
        ObjectNode result = Json.newObject();
        result.put("data", Json.toJson(Store.find.findList()));
        return ok(result);
    }
  
}
