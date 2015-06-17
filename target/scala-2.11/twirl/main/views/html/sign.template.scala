
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

    
    


    """),format.raw/*20.5*/("""<style type="text/css">
     .container-bg"""),format.raw/*21.19*/("""{"""),format.raw/*21.20*/("""
        """),format.raw/*22.9*/("""margin-left: 120px;
        margin-right: 120px;
        margin-top: 0px;
        background-color: #FFF5EE;
     """),format.raw/*26.6*/("""}"""),format.raw/*26.7*/("""
     
    """),format.raw/*28.5*/("""</style>
  </head>

  <body>
    <div class="container">
      <div class="jumbotron" style="background-color: #FFF5EE;">
        <br> how to sign?
        <p>Select a contract:
        <form action="/hash_file">
          
            <label id="selcon">
              <input type="file" name="selcon" id="selcon" enctype="multipart/form-data">
            </label>

            <label id="hash_contract">
              <textarea type="text"  name="conHash"  id="conHash"  style="height:50px; width:500px; background-color: #FFF5EE;"></textarea>
              <br>
              <script src="http://crypto-js.googlecode.com/svn/tags/3.1.2/build/rollups/sha256.js"></script>
              <script src="http://crypto-js.googlecode.com/svn/tags/3.1.2/build/rollups/ripemd160.js"></script>
              <script type="text/javascript">
              document.getElementById("hash_contract").style.display="none";
              function handleFileSelect(evt) """),format.raw/*49.46*/("""{"""),format.raw/*49.47*/("""
                """),format.raw/*50.17*/("""var files = evt.target.files; // FileList object
                var output = [];
                for (var i = 0, f; f = files[i]; i++) """),format.raw/*52.55*/("""{"""),format.raw/*52.56*/("""
                  """),format.raw/*53.19*/("""var reader = new FileReader();
                  reader.onload = (function(theFile) """),format.raw/*54.54*/("""{"""),format.raw/*54.55*/("""
                    """),format.raw/*55.21*/("""return function(e) """),format.raw/*55.40*/("""{"""),format.raw/*55.41*/("""
                      """),format.raw/*56.23*/("""var element = document.getElementById('conHash');
                      element.value = CryptoJS.SHA256(e.target.result);
                      document.getElementById("hash_contract").style.display="block";
                    """),format.raw/*59.21*/("""}"""),format.raw/*59.22*/(""";
                  """),format.raw/*60.19*/("""}"""),format.raw/*60.20*/(""")(f);
                  reader.readAsDataURL(f);
                """),format.raw/*62.17*/("""}"""),format.raw/*62.18*/("""
              """),format.raw/*63.15*/("""}"""),format.raw/*63.16*/("""
              """),format.raw/*64.15*/("""document.getElementById('selcon').addEventListener('change', handleFileSelect, false);

              </script>
            </label>
  
       
        <p><div class="container">
        <button type="submit" class="btn btn-primary" data-toggle="tooltip" title="Sign the contract." name="sign">Hash</button>
        <button type="submit" class="btn btn-primary" data-toggle="tooltip" title="Sign the contract." name="sign">Sign</button>
		    <button type="button" class="btn btn-primary" data-toggle="tooltip" title="Give the contract a timestamp.">Timestamp</button>
		    <button type="button" class="btn btn-primary" data-toggle="tooltip" title="Sign & Timestamp the contract.">S&T</button></p>
        </form>
      </div>
    </div>

    
  <!--  <div class="alert alert-success">
    	<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
  		<strong>Success!</strong> Your contract have been uploaded successfully!
   	</div>
  -->
    
  </body>
    """),_display_(/*87.6*/footer()),format.raw/*87.14*/("""
"""),format.raw/*88.1*/("""</html>"""))
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
                  DATE: Wed Jun 17 22:30:36 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/sign.scala.html
                  HASH: 5f2ebb8214b21029d2f78fdfbd10d83216a9516a
                  MATRIX: 607->0|791->159|804->165|886->239|925->241|957->244|986->246|1076->310|1105->318|1150->336|1220->378|1249->379|1285->388|1426->502|1454->503|1492->514|2475->1469|2504->1470|2549->1487|2713->1623|2742->1624|2789->1643|2901->1727|2930->1728|2979->1749|3026->1768|3055->1769|3106->1792|3362->2020|3391->2021|3439->2041|3468->2042|3561->2107|3590->2108|3633->2123|3662->2124|3705->2139|4715->3123|4744->3131|4772->3132
                  LINES: 25->1|31->7|31->7|31->7|31->7|33->9|35->11|38->14|38->14|44->20|45->21|45->21|46->22|50->26|50->26|52->28|73->49|73->49|74->50|76->52|76->52|77->53|78->54|78->54|79->55|79->55|79->55|80->56|83->59|83->59|84->60|84->60|86->62|86->62|87->63|87->63|88->64|111->87|111->87|112->88
                  -- GENERATED --
              */
          