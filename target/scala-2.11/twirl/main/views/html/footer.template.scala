
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object footer_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>

</body>
  <div class="container">
    <hr>
    <footer>
    	&copy; EC on BC 2015 
    	-by Gao
    </footer>
  </div>
</html>
    	
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object footer extends footer_Scope0.footer
              /*
                  -- GENERATED --
                  DATE: Wed Jun 17 20:58:40 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/footer.scala.html
                  HASH: 2c647755bff5ee77d488d65ddfbe4b5bb31bf988
                  MATRIX: 611->0
                  LINES: 25->1
                  -- GENERATED --
              */
          