
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html lang="en">
	<head>
		<title>EC on BC-About</title>
		"""),_display_(/*6.4*/header()),format.raw/*6.12*/("""
	"""),format.raw/*7.2*/("""</head>

	<body>
		<div class="container">
      	<div class="jumbotron" style="background-color: #FFF5EE;">
			<br>About this site.
			<br>Purpose
			<br>Problem
		</div>
		</div>
	</body>
  """),_display_(/*18.4*/footer()),format.raw/*18.12*/("""
"""),format.raw/*19.1*/("""</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Wed Jun 17 20:59:32 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/about.scala.html
                  HASH: 715975bf4dcde6e663a5015ec77229841eda6b8c
                  MATRIX: 609->0|711->77|739->85|767->87|986->280|1015->288|1043->289
                  LINES: 25->1|30->6|30->6|31->7|42->18|42->18|43->19
                  -- GENERATED --
              */
          