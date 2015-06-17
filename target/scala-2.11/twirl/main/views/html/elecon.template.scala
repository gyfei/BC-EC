
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object elecon_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class elecon extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html lang="en">
   <title>EC on BC-Homepage</title>
    """),_display_(/*5.6*/header()),format.raw/*5.14*/("""
    """),format.raw/*6.5*/("""<style type="text/css">
      .panel-height """),format.raw/*7.21*/("""{"""),format.raw/*7.22*/("""
        """),format.raw/*8.9*/("""height: 130px;
    """),format.raw/*9.5*/("""}"""),format.raw/*9.6*/("""
      

    """),format.raw/*12.5*/("""</style>
    <body>
      <div class="container">
        <div class="row">
            <div class="panel-group">

              <!--S&T-->
                <div class="col-sm-4" > 
                  <div class = "panel panel-info">
                    <div class="panel-heading"><a href="/sign" style="text-decoration: none"><h3><span class="glyphicon glyphicon-pencil"></span>&nbspSign & Timestamp&nbsp<span class="glyphicon glyphicon-time"></h3></a></div>
                    <div class="panel-body panel-height"><p>Upload a contract</p>
                    <p>Sign and Timestamp the contract</p></div>
                  </div>
                </div>

              <!--Verify-->
                <div class="col-sm-4">
                  <div class = "panel panel-info">
                    <div class="panel-heading"><a href="/verify" style="text-decoration: none"><h3><span class="glyphicon glyphicon-check"></span>&nbspVerify</h3></a></div>
                    <div class="panel-body panel-height"><p>Upload a contract or input the Contract ID</p>
                    <p>Check if the contract being signed and its integrity</p></div>
                  </div>
                </div>

              <!--About-->
                <div class="col-sm-4">
                  <div class = "panel panel-info">
                    <div class="panel-heading"><a href="/about" style="text-decoration: none"><h3><span class="glyphicon glyphicon-book"></span>&nbspTechnology</h3></a></div>
                    <div class="panel-body panel-height"><p>Learn the Digital Signature and Timestamp</p>
                    <p>Learn what Blockchain is</p></div>
                  </div>
                </div>

            </div>
        </div>
    </div>

<!-- Write explaination in other files and include contents  -->
<div class="container">
    <div> Expain S&T</div>
    <div> Expain Verification</div>
    <div> Expain DS & TS & Blockchain</div>
    </div>


    </body>

    
    """),_display_(/*60.6*/footer()),format.raw/*60.14*/("""
"""),format.raw/*61.1*/("""</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object elecon extends elecon_Scope0.elecon
              /*
                  -- GENERATED --
                  DATE: Wed Jun 17 20:58:40 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/elecon.scala.html
                  HASH: 1c5086ca925c7ea1a9e87142e6aba4b1bc7d8dc3
                  MATRIX: 611->0|711->75|739->83|770->88|841->132|869->133|904->142|949->161|976->162|1016->175|3012->2145|3041->2153|3069->2154
                  LINES: 25->1|29->5|29->5|30->6|31->7|31->7|32->8|33->9|33->9|36->12|84->60|84->60|85->61
                  -- GENERATED --
              */
          