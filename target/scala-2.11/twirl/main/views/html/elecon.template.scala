
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

<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*3.98*/("""">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">


<html lang="en">
   <title>EC on BC-Homepage</title>
    """),_display_(/*9.6*/header()),format.raw/*9.14*/("""
    """),format.raw/*10.5*/("""<style type="text/css">
      .panel-height """),format.raw/*11.21*/("""{"""),format.raw/*11.22*/("""
              """),format.raw/*12.15*/("""height: 130px;
    """),format.raw/*13.5*/("""}"""),format.raw/*13.6*/("""
      

    """),format.raw/*16.5*/("""</style>
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
                    <div class="panel-heading"><a href="/verify" style="text-decoration: none"><h3><span class="glyphicon glyphicon-question-sign"></span>&nbspAbout</h3></a></div>
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

    <hr>
    """),_display_(/*64.6*/footer()),format.raw/*64.14*/("""
"""),format.raw/*65.1*/("""</html>"""))
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
                  DATE: Wed Jun 17 20:02:44 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/elecon.scala.html
                  HASH: 6b12738197bf88082044cff1b2ff88947d706632
                  MATRIX: 611->0|699->62|713->68|779->114|969->279|997->287|1029->292|1101->336|1130->337|1173->352|1219->371|1247->372|1287->385|3292->2364|3321->2372|3349->2373
                  LINES: 25->1|27->3|27->3|27->3|33->9|33->9|34->10|35->11|35->11|36->12|37->13|37->13|40->16|88->64|88->64|89->65
                  -- GENERATED --
              */
          