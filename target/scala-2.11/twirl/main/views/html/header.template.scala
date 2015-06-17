
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
  <!-- Dynamic nav bar-->  
    <script type="text/javascript">
      $(function()"""),format.raw/*16.19*/("""{"""),format.raw/*16.20*/("""
        """),format.raw/*17.9*/("""function stripTrailingSlash(str) """),format.raw/*17.42*/("""{"""),format.raw/*17.43*/("""
          """),format.raw/*18.11*/("""if(str.substr(-1) == '/') """),format.raw/*18.37*/("""{"""),format.raw/*18.38*/("""
            """),format.raw/*19.13*/("""return str.substr(0, str.length - 1);
          """),format.raw/*20.11*/("""}"""),format.raw/*20.12*/("""
          """),format.raw/*21.11*/("""return str;
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""var url = window.location.pathname;  
        var activePage = stripTrailingSlash(url);
        $('.nav li a').each(function()"""),format.raw/*25.39*/("""{"""),format.raw/*25.40*/("""  
          """),format.raw/*26.11*/("""var currentPage = stripTrailingSlash($(this).attr('href'));
          if (activePage == currentPage) """),format.raw/*27.42*/("""{"""),format.raw/*27.43*/("""
            """),format.raw/*28.13*/("""$(this).parent().addClass('active'); 
          """),format.raw/*29.11*/("""}"""),format.raw/*29.12*/(""" 
          """),format.raw/*30.11*/("""else"""),format.raw/*30.15*/("""{"""),format.raw/*30.16*/("""$(this).parent().removeClass('active');"""),format.raw/*30.55*/("""}"""),format.raw/*30.56*/("""
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/(""");
      """),format.raw/*32.7*/("""}"""),format.raw/*32.8*/(""");
    </script>

    <style type="text/css">
      h1"""),format.raw/*36.9*/("""{"""),format.raw/*36.10*/("""
        """),format.raw/*37.9*/("""color: black !important; 
        text-shadow: 0 0 0.2em #F0FFF0, 0 0 0.2em #F0FFF0, 0 0 0.2em #F0FFF0;
        opacity: 1;
    """),format.raw/*40.5*/("""}"""),format.raw/*40.6*/("""
      """),format.raw/*41.7*/(""".h3-1"""),format.raw/*41.12*/("""{"""),format.raw/*41.13*/("""
        """),format.raw/*42.9*/("""color: white; text-shadow: black 0.1em 0.1em 0.2em
      """),format.raw/*43.7*/("""}"""),format.raw/*43.8*/("""

    """),format.raw/*45.5*/("""</style>
  </head>

  <body>
      <nav class="navbar navbar-inverse">
        <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">&nbsp&nbsp&nbsp&nbsp&nbspEC on BC&nbsp&nbsp&nbsp&nbsp</a>
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
              <!--  <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>  -->
                <li><a href="https://github.com/gyfei/BC-EC"><span class="glyphicon glyphicon-file"></span> Source</a></li>
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
                  DATE: Wed Jun 17 20:06:49 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/header.scala.html
                  HASH: 72030173ba35a5bc4b575e371385e3174667f1d8
                  MATRIX: 611->0|767->130|781->136|847->182|1313->620|1342->621|1378->630|1439->663|1468->664|1507->675|1561->701|1590->702|1631->715|1707->763|1736->764|1775->775|1822->795|1851->796|1887->805|2041->931|2070->932|2111->945|2240->1046|2269->1047|2310->1060|2386->1108|2415->1109|2455->1121|2487->1125|2516->1126|2583->1165|2612->1166|2648->1175|2677->1176|2713->1185|2741->1186|2822->1240|2851->1241|2887->1250|3042->1378|3070->1379|3104->1386|3137->1391|3166->1392|3202->1401|3286->1458|3314->1459|3347->1465
                  LINES: 25->1|28->4|28->4|28->4|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|44->20|44->20|45->21|46->22|46->22|47->23|49->25|49->25|50->26|51->27|51->27|52->28|53->29|53->29|54->30|54->30|54->30|54->30|54->30|55->31|55->31|56->32|56->32|60->36|60->36|61->37|64->40|64->40|65->41|65->41|65->41|66->42|67->43|67->43|69->45
                  -- GENERATED --
              */
          