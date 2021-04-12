package controllers;

import play.mvc.*;

import views.html.index;

import views.html.Home.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result about (String name, String lastname) {
        return ok("Hi " + name + " " + lastname + " This is the first simple project using Play framework" );
    }

    public Result welcome(String name, String lastName){
        return ok(welcome.render(name, lastName));
    }

}
