
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kou/git/BC-EC/conf/routes
// @DATE:Wed Jun 17 20:41:52 JST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  Application_1: controllers.Application,
  // @LINE:20
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    Application_1: controllers.Application,
    // @LINE:20
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.elecon"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sign""", """controllers.Application.sign"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """verify""", """controllers.Application.verify"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.Application.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """start""", """controllers.Application.start"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_Application_elecon0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_elecon0_invoker = createInvoker(
    Application_1.elecon,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "elecon",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_sign1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sign")))
  )
  private[this] lazy val controllers_Application_sign1_invoker = createInvoker(
    Application_1.sign,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "sign",
      Nil,
      "GET",
      """ Sign page""",
      this.prefix + """sign"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_verify2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("verify")))
  )
  private[this] lazy val controllers_Application_verify2_invoker = createInvoker(
    Application_1.verify,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "verify",
      Nil,
      "GET",
      """ Verify page""",
      this.prefix + """verify"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_about3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_Application_about3_invoker = createInvoker(
    Application_1.about,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "about",
      Nil,
      "GET",
      """ About this site""",
      this.prefix + """about"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_start4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("start")))
  )
  private[this] lazy val controllers_Application_start4_invoker = createInvoker(
    Application_1.start,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "start",
      Nil,
      "GET",
      """ Start to use""",
      this.prefix + """start"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_Application_elecon0_route(params) =>
      call { 
        controllers_Application_elecon0_invoker.call(Application_1.elecon)
      }
  
    // @LINE:11
    case controllers_Application_sign1_route(params) =>
      call { 
        controllers_Application_sign1_invoker.call(Application_1.sign)
      }
  
    // @LINE:13
    case controllers_Application_verify2_route(params) =>
      call { 
        controllers_Application_verify2_invoker.call(Application_1.verify)
      }
  
    // @LINE:15
    case controllers_Application_about3_route(params) =>
      call { 
        controllers_Application_about3_invoker.call(Application_1.about)
      }
  
    // @LINE:17
    case controllers_Application_start4_route(params) =>
      call { 
        controllers_Application_start4_invoker.call(Application_1.start)
      }
  
    // @LINE:20
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_0.versioned(path, file))
      }
  }
}