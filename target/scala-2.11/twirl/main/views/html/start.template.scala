
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object start_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class start extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html lang="en">
	<head>
		<title>EC on BC-Start</title>
		"""),_display_(/*6.4*/header()),format.raw/*6.12*/("""
	"""),format.raw/*7.2*/("""</head>

	<body>
	  <div class="container">
      	<div class="jumbotron" style="background-color: #FFF5EE;">
		Learn how to use
		</div>
	  </div>
	</body>
	"""),_display_(/*16.3*/footer()),format.raw/*16.11*/("""
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
object start extends start_Scope0.start
              /*
                  -- GENERATED --
                  DATE: Wed Jun 17 20:58:40 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/start.scala.html
                  HASH: 61ac3e55d04f456796fb6431f5b93a179e353bbf
                  MATRIX: 609->0|711->77|739->85|767->87|952->246|981->254|1009->255
                  LINES: 25->1|30->6|30->6|31->7|40->16|40->16|41->17
                  -- GENERATED --
              */
          