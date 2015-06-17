
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<!-- Defines a link between a document and an external resource -->
<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*4.98*/("""">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">

<html lang="en">
  <head>
    <meta charset="utf-8"> 
    

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script type="text/javascript">
      $(document).ready(function () """),format.raw/*15.37*/("""{"""),format.raw/*15.38*/("""
        """),format.raw/*16.9*/("""$('ul.nav > li').click(function (e) """),format.raw/*16.45*/("""{"""),format.raw/*16.46*/("""
            
            """),format.raw/*18.13*/("""$('ul.nav > li').removeClass('active');
            $(this).addClass('active');             
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""e.preventDefault();

      """),format.raw/*23.7*/("""}"""),format.raw/*23.8*/(""");
    </script>

    <style type="text/css">
      h1"""),format.raw/*27.9*/("""{"""),format.raw/*27.10*/("""
        """),format.raw/*28.9*/("""color: black !important; 
        text-shadow: 0 0 0.2em #F0FFF0, 0 0 0.2em #F0FFF0, 0 0 0.2em #F0FFF0;
        opacity: 1;
    """),format.raw/*31.5*/("""}"""),format.raw/*31.6*/("""
      """),format.raw/*32.7*/(""".h3-1"""),format.raw/*32.12*/("""{"""),format.raw/*32.13*/("""
        """),format.raw/*33.9*/("""color: white; text-shadow: black 0.1em 0.1em 0.2em
      """),format.raw/*34.7*/("""}"""),format.raw/*34.8*/("""

    """),format.raw/*36.5*/("""</style>
  </head>

  <body>
      <nav class="navbar navbar-inverse">
        <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">&nbsp&nbsp&nbsp&nbspEC on BC&nbsp&nbsp&nbsp&nbsp</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
              <!--Home-->
                <li class="active"><a href="/"><span class="glyphicon glyphicon-home"></span>&nbspHome</a></li>
              <!--S&T-->
                <li><a href="/sign"><span class="glyphicon glyphicon-pencil"></span>&nbspS&T&nbsp<span class="glyphicon glyphicon-time"></span></a></li>
              <!--Verify-->
                <li><a href="/verify"><span class="glyphicon glyphicon-check"></span>&nbspVerify</a></li> 
              <!--About-->
                <li><a href="#"><span class="glyphicon glyphicon-question-sign"></span>&nbspAbout</a></li> 
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </ul>
        </div>
        </div>
      </nav>

      <div class="container">
        <div class="jumbotron" style="background-image: url(http://www.contractil.com/wp-content/uploads/2013/11/contract.jpg); background-size: 100%; opacity: 0.7;">
            <h1>Eletronic Contracts on Blockchain</h1>
            <h3 class="h3-1">Sign & Timestamp your contracts on Blockchain</h3> 
        </div>
      </div>


  </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Wed Jun 17 18:42:42 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/header.scala.html
                  HASH: 103dce59d8569216a12e1abfbc76a14c3b57912b
                  MATRIX: 611->0|767->130|781->136|847->182|1303->610|1332->611|1368->620|1432->656|1461->657|1515->683|1643->784|1672->785|1708->794|1762->821|1790->822|1871->876|1900->877|1936->886|2091->1014|2119->1015|2153->1022|2186->1027|2215->1028|2251->1037|2335->1094|2363->1095|2396->1101
                  LINES: 25->1|28->4|28->4|28->4|39->15|39->15|40->16|40->16|40->16|42->18|44->20|44->20|45->21|47->23|47->23|51->27|51->27|52->28|55->31|55->31|56->32|56->32|56->32|57->33|58->34|58->34|60->36
                  -- GENERATED --
              */
          