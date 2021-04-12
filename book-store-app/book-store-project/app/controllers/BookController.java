package controllers;

import play.data.Form;
import play.mvc.*;
import model.*;
import views.html.books.*;

import play.api.i18n.I18nSupport;
import java.util.Set;
import javax.inject.Inject;
import play.data.FormFactory;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class BookController extends Controller {

    @Inject
    FormFactory formFactory;

    // for all books
   public Result index () {
       Set<Book> books = Book.allBooks();
       return ok(index.render(books));
   }

   //to create book
    public Result create(){
       Form<Book> bookForm = formFactory.form(Book.class);
       return ok(create.render(bookForm));
    }

    //to save book
    public Result save() {
        return ok("save");
    }

    //to edit
    public Result edit (Integer id){
        return ok("edit book has id " + id);
    }

    //to update
    public Result update(){
        return ok("update");
    }

    public Result destroy(Integer id){
        return ok("destroy book has id " + id);
    }

    //for book detail
    public Result show(Integer id){
        return ok("show book has id " + id);
    }



}