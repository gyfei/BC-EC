
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




"""),format.raw/*14.1*/("""<html lang="en">
  <head>
    <title>EC on BC-Sign</title>
    """),_display_(/*17.6*/header()),format.raw/*17.14*/("""
    """),format.raw/*18.5*/("""<style type="text/css">
     .container-bg"""),format.raw/*19.19*/("""{"""),format.raw/*19.20*/("""
        """),format.raw/*20.9*/("""margin-left: 100px;
        margin-right: 100px;
        margin-top: 0px;
        background-color: #FFFACD;
     """),format.raw/*24.6*/("""}"""),format.raw/*24.7*/("""
    """),format.raw/*25.5*/("""</style>
  </head>

  <body>
    <div class="container-bg">
        <p>Select a contract:</p>
        <input type="file" name="contract">
    <p><div class="container">
        <button type="button" class="btn btn-primary">Sign</button>
		<button type="button" class="btn btn-primary">Timestamp</button>
		<button type="button" class="btn btn-primary">Verify</button>
    </p></div>

    
    <div class="alert alert-success">
    	<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
  		<strong>Success!</strong> Your contract have been uploaded successfully!
   	</div>
    </div>
  </body>
    """),_display_(/*45.6*/footer()),format.raw/*45.14*/("""
"""),format.raw/*46.1*/("""</html>"""))
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
                  DATE: Wed Jun 17 19:01:48 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/sign.scala.html
                  HASH: af6d75489062405ac55bbeca7902e09fc59db0e0
                  MATRIX: 607->0|791->159|804->165|886->239|925->241|957->244|989->249|1079->313|1108->321|1140->326|1210->368|1239->369|1275->378|1416->492|1444->493|1476->498|2126->1122|2155->1130|2183->1131
                  LINES: 25->1|31->7|31->7|31->7|31->7|33->9|38->14|41->17|41->17|42->18|43->19|43->19|44->20|48->24|48->24|49->25|69->45|69->45|70->46
                  -- GENERATED --
              */
          