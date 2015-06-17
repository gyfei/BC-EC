
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object hash_file_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class hash_file extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/helper/*1.8*/.form(action = routes.Application.sign, 'enctype -> "multipart/form-data")/*1.82*/ {_display_(Seq[Any](format.raw/*1.84*/("""

""")))}),format.raw/*3.2*/("""

"""),format.raw/*5.1*/("""hello"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object hash_file extends hash_file_Scope0.hash_file
              /*
                  -- GENERATED --
                  DATE: Wed Jun 17 21:40:31 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/hash_file.scala.html
                  HASH: 522f4d4b374bf5a512688a0419b4728b6856ed63
                  MATRIX: 617->1|630->7|712->81|751->83|783->86|811->88
                  LINES: 25->1|25->1|25->1|25->1|27->3|29->5
                  -- GENERATED --
              */
          