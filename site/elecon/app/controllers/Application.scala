package controllers  //controllers are action generators

import play.api._
import play.api.mvc._

class Application extends Controller {
 //  most of the requests received by Play applications are handled by Action
  // simplest use case for degining an action generator: 
  // a method with no parameters that returns an Action value
  def index = Action {
   // Ok(views.html.index("Your new application is ready."))
   // Ok("Hello world") 
   /* implicit request =>
   Ok("Got request [" + request + "]") */
  
  }

}
