
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
    /*  $(document).ready(function () """),format.raw/*16.39*/("""{"""),format.raw/*16.40*/("""
        """),format.raw/*17.9*/("""$('ul.nav > li').click(function (e) """),format.raw/*17.45*/("""{"""),format.raw/*17.46*/("""
            
            """),format.raw/*19.13*/("""$('ul.nav > li').removeClass('active');
            e.preventDefault();
            $(this).addClass('active');     
            e.Default();        
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/(""");
        
      """),format.raw/*25.7*/("""}"""),format.raw/*25.8*/(""");
*/
      $(function()"""),format.raw/*27.19*/("""{"""),format.raw/*27.20*/("""
  """),format.raw/*28.3*/("""function stripTrailingSlash(str) """),format.raw/*28.36*/("""{"""),format.raw/*28.37*/("""
    """),format.raw/*29.5*/("""if(str.substr(-1) == '/') """),format.raw/*29.31*/("""{"""),format.raw/*29.32*/("""
      """),format.raw/*30.7*/("""return str.substr(0, str.length - 1);
    """),format.raw/*31.5*/("""}"""),format.raw/*31.6*/("""
    """),format.raw/*32.5*/("""return str;
  """),format.raw/*33.3*/("""}"""),format.raw/*33.4*/("""

  """),format.raw/*35.3*/("""var url = window.location.pathname;  
  var activePage = stripTrailingSlash(url);

  $('.nav li a').each(function()"""),format.raw/*38.33*/("""{"""),format.raw/*38.34*/("""  
    """),format.raw/*39.5*/("""var currentPage = stripTrailingSlash($(this).attr('href'));

    if (activePage == currentPage) """),format.raw/*41.36*/("""{"""),format.raw/*41.37*/("""
      """),format.raw/*42.7*/("""$(this).parent().addClass('active'); 
    """),format.raw/*43.5*/("""}"""),format.raw/*43.6*/(""" 
    """),format.raw/*44.5*/("""else"""),format.raw/*44.9*/("""{"""),format.raw/*44.10*/("""$(this).parent().removeClass('active');"""),format.raw/*44.49*/("""}"""),format.raw/*44.50*/("""
  """),format.raw/*45.3*/("""}"""),format.raw/*45.4*/(""");
"""),format.raw/*46.1*/("""}"""),format.raw/*46.2*/(""");
    </script>

    <style type="text/css">
      h1"""),format.raw/*50.9*/("""{"""),format.raw/*50.10*/("""
        """),format.raw/*51.9*/("""color: black !important; 
        text-shadow: 0 0 0.2em #F0FFF0, 0 0 0.2em #F0FFF0, 0 0 0.2em #F0FFF0;
        opacity: 1;
    """),format.raw/*54.5*/("""}"""),format.raw/*54.6*/("""
      """),format.raw/*55.7*/(""".h3-1"""),format.raw/*55.12*/("""{"""),format.raw/*55.13*/("""
        """),format.raw/*56.9*/("""color: white; text-shadow: black 0.1em 0.1em 0.2em
      """),format.raw/*57.7*/("""}"""),format.raw/*57.8*/("""

    """),format.raw/*59.5*/("""</style>
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
                  DATE: Wed Jun 17 19:19:59 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/header.scala.html
                  HASH: e70f8134b0338b9acbb5d828bfe3ceb423991408
                  MATRIX: 611->0|767->130|781->136|847->182|1333->640|1362->641|1398->650|1462->686|1491->687|1545->713|1730->871|1759->872|1804->890|1832->891|1884->915|1913->916|1943->919|2004->952|2033->953|2065->958|2119->984|2148->985|2182->992|2251->1034|2279->1035|2311->1040|2352->1054|2380->1055|2411->1059|2554->1174|2583->1175|2617->1182|2741->1278|2770->1279|2804->1286|2873->1328|2901->1329|2934->1335|2965->1339|2994->1340|3061->1379|3090->1380|3120->1383|3148->1384|3178->1387|3206->1388|3287->1442|3316->1443|3352->1452|3507->1580|3535->1581|3569->1588|3602->1593|3631->1594|3667->1603|3751->1660|3779->1661|3812->1667
                  LINES: 25->1|28->4|28->4|28->4|40->16|40->16|41->17|41->17|41->17|43->19|47->23|47->23|49->25|49->25|51->27|51->27|52->28|52->28|52->28|53->29|53->29|53->29|54->30|55->31|55->31|56->32|57->33|57->33|59->35|62->38|62->38|63->39|65->41|65->41|66->42|67->43|67->43|68->44|68->44|68->44|68->44|68->44|69->45|69->45|70->46|70->46|74->50|74->50|75->51|78->54|78->54|79->55|79->55|79->55|80->56|81->57|81->57|83->59
                  -- GENERATED --
              */
          