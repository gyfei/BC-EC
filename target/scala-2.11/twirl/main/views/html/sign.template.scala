
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
     """),format.raw/*27.6*/("""textarea """),format.raw/*27.15*/("""{"""),format.raw/*27.16*/("""
        """),format.raw/*28.9*/("""border-color: Transparent;
        outline: none;
        resize: none;
        height:50px; width:800px; 
        background-color: #FFF5EE;
      """),format.raw/*33.7*/("""}"""),format.raw/*33.8*/("""

     
    """),format.raw/*36.5*/("""</style>
  </head>

  <body>
    <div class="container">
      <div class="jumbotron" style="background-color: #FFF5EE;">
        <br> how to sign?
        <p>Select a contract:
        <form action="/hash_file">
          <!-- Read contract, hash locally, and show hash(contract) on the same page.-->
            <label id="selcon">
              <input type="file" name="selcon" id="selcon" enctype="multipart/form-data">
            </label>

            <label id="hash_contract">
              <textarea type="text"  name="conHash"  id="conHash" ></textarea>
              <br>
              <script src="http://crypto-js.googlecode.com/svn/tags/3.1.2/build/rollups/sha256.js"></script>
              <script src="http://crypto-js.googlecode.com/svn/tags/3.1.2/build/rollups/ripemd160.js"></script>
              <script type="text/javascript">
              document.getElementById("hash_contract").style.display="none";
              function handleFileSelect(evt) """),format.raw/*57.46*/("""{"""),format.raw/*57.47*/("""
                """),format.raw/*58.17*/("""var files = evt.target.files; // FileList object
                var output = [];
                for (var i = 0, f; f = files[i]; i++) """),format.raw/*60.55*/("""{"""),format.raw/*60.56*/("""
                  """),format.raw/*61.19*/("""var reader = new FileReader();
                  reader.onload = (function(theFile) """),format.raw/*62.54*/("""{"""),format.raw/*62.55*/("""
                    """),format.raw/*63.21*/("""return function(e) """),format.raw/*63.40*/("""{"""),format.raw/*63.41*/("""
                      """),format.raw/*64.23*/("""var element = document.getElementById('conHash');
                      element.value = CryptoJS.SHA256(e.target.result);
                      document.getElementById("hash_contract").style.display="block";
                    """),format.raw/*67.21*/("""}"""),format.raw/*67.22*/(""";
                  """),format.raw/*68.19*/("""}"""),format.raw/*68.20*/(""")(f);
                  reader.readAsDataURL(f);
                """),format.raw/*70.17*/("""}"""),format.raw/*70.18*/("""
              """),format.raw/*71.15*/("""}"""),format.raw/*71.16*/("""
              """),format.raw/*72.15*/("""document.getElementById('selcon').addEventListener('change', handleFileSelect, false);

              </script>
            </label>
  
       
        <p><div class="container">
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
    """),_display_(/*94.6*/footer()),format.raw/*94.14*/("""
"""),format.raw/*95.1*/("""</html>"""))
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
                  DATE: Wed Jun 17 22:48:33 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/sign.scala.html
                  HASH: 116d4495fa5b10a0dd63de0b60705e374bdd28c7
                  MATRIX: 607->0|791->159|804->165|886->239|925->241|957->244|986->246|1076->310|1105->318|1150->336|1220->378|1249->379|1285->388|1426->502|1454->503|1487->509|1524->518|1553->519|1589->528|1764->676|1792->677|1831->689|2831->1661|2860->1662|2905->1679|3069->1815|3098->1816|3145->1835|3257->1919|3286->1920|3335->1941|3382->1960|3411->1961|3462->1984|3718->2212|3747->2213|3795->2233|3824->2234|3917->2299|3946->2300|3989->2315|4018->2316|4061->2331|4942->3186|4971->3194|4999->3195
                  LINES: 25->1|31->7|31->7|31->7|31->7|33->9|35->11|38->14|38->14|44->20|45->21|45->21|46->22|50->26|50->26|51->27|51->27|51->27|52->28|57->33|57->33|60->36|81->57|81->57|82->58|84->60|84->60|85->61|86->62|86->62|87->63|87->63|87->63|88->64|91->67|91->67|92->68|92->68|94->70|94->70|95->71|95->71|96->72|118->94|118->94|119->95
                  -- GENERATED --
              */
          