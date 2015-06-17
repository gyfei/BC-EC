
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sign_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class sign extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!-- todo1: rewrite with jade -->
<!-- todo2: add CSS(or LESS?) -->
<!-- todo2.5: animate.css-->
<!-- todo3: make head in a separate file-->

<!DOCTYPE html>
"""),_display_(/*7.2*/helper/*7.8*/.form(action = routes.Application.sign, 'enctype -> "multipart/form-data")/*7.82*/ {_display_(Seq[Any](format.raw/*7.84*/("""

""")))}),format.raw/*9.2*/("""

"""),format.raw/*11.1*/("""<html lang="en">
  <head>
    <title>EC on BC-Sign</title>
    """),_display_(/*14.6*/header()),format.raw/*14.14*/("""
    """),format.raw/*15.5*/("""<style type="text/css">
     .container-bg"""),format.raw/*16.19*/("""{"""),format.raw/*16.20*/("""
        """),format.raw/*17.9*/("""margin-left: 120px;
        margin-right: 120px;
        margin-top: 0px;
        background-color: #FFF5EE;
     """),format.raw/*21.6*/("""}"""),format.raw/*21.7*/("""
     
    """),format.raw/*23.5*/("""</style>
  </head>

  <body>
    <div class="container">
      <div class="jumbotron" style="background-color: #FFF5EE;">
        <br> how to sign?
        <p>Select a contract:</p>
        <input type="file" name="contract">
        <p><div class="container">
        <button type="button" class="btn btn-primary" data-toggle="tooltip" title="Sign the contract.">Sign</button>
		    <button type="button" class="btn btn-primary" data-toggle="tooltip" title="Give the contract a timestamp.">Timestamp</button>
		    <button type="button" class="btn btn-primary" data-toggle="tooltip" title="Sign & Timestamp the contract.">S&T</button></p>
      </div>
    </div>

    
  <!--  <div class="alert alert-success">
    	<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
  		<strong>Success!</strong> Your contract have been uploaded successfully!
   	</div>
  -->
    </div>
  </body>
    """),_display_(/*47.6*/footer()),format.raw/*47.14*/("""
"""),format.raw/*48.1*/("""</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object sign extends sign_Scope0.sign
              /*
                  -- GENERATED --
                  DATE: Wed Jun 17 21:00:42 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/sign.scala.html
                  HASH: a5ec11d2a4636a2725c9b97d10949ebc6007becb
                  MATRIX: 607->0|791->159|804->165|886->239|925->241|957->244|986->246|1076->310|1105->318|1137->323|1207->365|1236->366|1272->375|1413->489|1441->490|1479->501|2420->1416|2449->1424|2477->1425
                  LINES: 25->1|31->7|31->7|31->7|31->7|33->9|35->11|38->14|38->14|39->15|40->16|40->16|41->17|45->21|45->21|47->23|71->47|71->47|72->48
                  -- GENERATED --
              */
          