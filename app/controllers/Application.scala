package controllers  //controllers are action generators

import play.api._
import play.api.mvc._
import models.Message
import play.mvc.Http



class Application extends Controller {
 //  most of the requests received by Play applications are handled by Action
  // simplest use case for degining an action generator: 
  // a method with no parameters that returns an Action value
  // An HTTP result with a status code, a set of HTTP headers and a body
  // to be sent to the web client. Redirects are simple results too.
  def index = Action {
   // direct to /app/views/index.scala.html
    //Ok(views.html.index("Your new application is ready."))
    //Ok(views.html.index("Your new application is ready."))
    Ok("index") 
   
  
  }

  def elecon = Action {
  	Ok(views.html.elecon.render())
  }
  def sign = Action {
  	Ok(views.html.sign.render())
  }
  def verify = Action {
  	Ok(views.html.verify.render())
  }


}



