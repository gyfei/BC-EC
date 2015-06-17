
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
  <title>EC on BC-Verify</title>
   """),_display_(/*6.5*/header()),format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<body>
      <div class="container">
        <p>Select a contract:</p>
        <input type="file" name="contract">
        <p><div class="container">
		  <button type="button" class="btn btn-primary">Verify</button>
        </div></p>
      </div>
    </body>
    """),_display_(/*16.6*/footer()),format.raw/*16.14*/("""
"""),format.raw/*17.1*/("""</html>"""))
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
                  DATE: Wed Jun 17 18:36:08 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/verify.scala.html
                  HASH: 4beab92fc7007dcab1fe0c1ee5e08629345c4d8b
                  MATRIX: 611->0|708->72|736->80|767->85|1058->350|1087->358|1115->359
                  LINES: 25->1|30->6|30->6|31->7|40->16|40->16|41->17
                  -- GENERATED --
              */
          