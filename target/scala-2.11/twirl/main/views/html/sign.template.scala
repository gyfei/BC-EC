
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
  <title>EC on BC-Sign</title>
   """),_display_(/*16.5*/header()),format.raw/*16.13*/("""
    """),format.raw/*17.5*/("""<body>
    <div class="container">
        <p>Select a contract:</p>
        <input type="file" name="contract">
    <p><div class="container">
        <button type="button" class="btn btn-primary">Sign</button>
		<button type="button" class="btn btn-primary">Timestamp</button>
		<button type="button" class="btn btn-primary">Verify</button>
    </div></p>

    <!-- can't be closed-->
    <div class="alert alert-success">
    	<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
  		<strong>Success!</strong> Your contract have been uploaded successfully!
   	</div>
    
    <div id="footer"></div>
</div>
    </body>
    """),_display_(/*36.6*/footer()),format.raw/*36.14*/("""
"""),format.raw/*37.1*/("""</html>"""))
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
                  DATE: Wed Jun 17 18:36:08 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/sign.scala.html
                  HASH: b7b75266b571dd381bef2ba251337fd5f72f09d6
                  MATRIX: 607->0|791->159|804->165|886->239|925->241|957->244|989->249|1067->301|1096->309|1128->314|1807->967|1836->975|1864->976
                  LINES: 25->1|31->7|31->7|31->7|31->7|33->9|38->14|40->16|40->16|41->17|60->36|60->36|61->37
                  -- GENERATED --
              */
          