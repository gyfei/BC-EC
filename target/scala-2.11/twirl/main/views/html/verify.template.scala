
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
     .container-bg"""),format.raw/*9.19*/("""{"""),format.raw/*9.20*/("""
        """),format.raw/*10.9*/("""margin-left: 120px;
        margin-right: 120px;
        margin-top: 0px;
        background-color: #FFF5EE;
     """),format.raw/*14.6*/("""}"""),format.raw/*14.7*/("""
     
    """),format.raw/*16.5*/("""</style>
  </head>


    <body>
      <div class="container">
      <div class="jumbotron" style="background-color: #FFF5EE;">
        <p>Select a contract:</p>
        <input type="file" name="contract">
        <p><div class="container">
          <button type="button" class="btn btn-primary">Search</button>
		  <button type="button" class="btn btn-primary">Verify</button>
        </div></p>
      </div>
      </div>
    </body>
    """),_display_(/*32.6*/footer()),format.raw/*32.14*/("""
"""),format.raw/*33.1*/("""</html>"""))
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
                  DATE: Wed Jun 17 19:55:12 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/verify.scala.html
                  HASH: 04df841531791cab0b56e025b98e0b368e308594
                  MATRIX: 611->0|718->82|746->90|776->94|845->136|873->137|909->146|1050->260|1078->261|1116->272|1582->712|1611->720|1639->721
                  LINES: 25->1|31->7|31->7|32->8|33->9|33->9|34->10|38->14|38->14|40->16|56->32|56->32|57->33
                  -- GENERATED --
              */
          