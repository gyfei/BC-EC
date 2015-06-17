
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class verify extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>


<html lang="en">
  <head>
   <title>EC on BC-Verify</title>
   """),_display_(/*7.5*/header()),format.raw/*7.13*/("""
   """),format.raw/*8.4*/("""<style type="text/css">

   </style>
  </head>


    <body>
      <div class="container">
        <p>Select a contract:</p>
        <input type="file" name="contract">
        <p><div class="container">
          <button type="button" class="btn btn-primary">Search</button>
		  <button type="button" class="btn btn-primary">Verify</button>
        </div></p>
      </div>
    </body>
    """),_display_(/*24.6*/footer()),format.raw/*24.14*/("""
"""),format.raw/*25.1*/("""</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object verify extends verify_Scope0.verify
              /*
                  -- GENERATED --
                  DATE: Wed Jun 17 18:56:30 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/verify.scala.html
                  HASH: 95b7b804a2c362c9be26aaa666b025d033929663
                  MATRIX: 611->0|718->82|746->90|776->94|1192->484|1221->492|1249->493
                  LINES: 25->1|31->7|31->7|32->8|48->24|48->24|49->25
                  -- GENERATED --
              */
          