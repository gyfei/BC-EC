
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
      """),format.raw/*31.7*/("""}"""),format.raw/*31.8*/("""

     
    """),format.raw/*34.5*/("""</style>
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
              <textarea type="text"  name="conHash"  id="conHash"  style="height:50px; width:800px; background-color: #FFF5EE;"></textarea>
              <br>
              <script src="http://crypto-js.googlecode.com/svn/tags/3.1.2/build/rollups/sha256.js"></script>
              <script src="http://crypto-js.googlecode.com/svn/tags/3.1.2/build/rollups/ripemd160.js"></script>
              <script type="text/javascript">
              document.getElementById("hash_contract").style.display="none";
              function handleFileSelect(evt) """),format.raw/*55.46*/("""{"""),format.raw/*55.47*/("""
                """),format.raw/*56.17*/("""var files = evt.target.files; // FileList object
                var output = [];
                for (var i = 0, f; f = files[i]; i++) """),format.raw/*58.55*/("""{"""),format.raw/*58.56*/("""
                  """),format.raw/*59.19*/("""var reader = new FileReader();
                  reader.onload = (function(theFile) """),format.raw/*60.54*/("""{"""),format.raw/*60.55*/("""
                    """),format.raw/*61.21*/("""return function(e) """),format.raw/*61.40*/("""{"""),format.raw/*61.41*/("""
                      """),format.raw/*62.23*/("""var element = document.getElementById('conHash');
                      element.value = CryptoJS.SHA256(e.target.result);
                      document.getElementById("hash_contract").style.display="block";
                    """),format.raw/*65.21*/("""}"""),format.raw/*65.22*/(""";
                  """),format.raw/*66.19*/("""}"""),format.raw/*66.20*/(""")(f);
                  reader.readAsDataURL(f);
                """),format.raw/*68.17*/("""}"""),format.raw/*68.18*/("""
              """),format.raw/*69.15*/("""}"""),format.raw/*69.16*/("""
              """),format.raw/*70.15*/("""document.getElementById('selcon').addEventListener('change', handleFileSelect, false);

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
    """),_display_(/*93.6*/footer()),format.raw/*93.14*/("""
"""),format.raw/*94.1*/("""</html>"""))
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
                  DATE: Wed Jun 17 22:45:51 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/sign.scala.html
                  HASH: a34aa81c6379c085c9b20be87d5f95ab5f0cf689
                  MATRIX: 607->0|791->159|804->165|886->239|925->241|957->244|986->246|1076->310|1105->318|1150->336|1220->378|1249->379|1285->388|1426->502|1454->503|1487->509|1524->518|1553->519|1589->528|1694->606|1722->607|1761->619|2744->1574|2773->1575|2818->1592|2982->1728|3011->1729|3058->1748|3170->1832|3199->1833|3248->1854|3295->1873|3324->1874|3375->1897|3631->2125|3660->2126|3708->2146|3737->2147|3830->2212|3859->2213|3902->2228|3931->2229|3974->2244|4984->3228|5013->3236|5041->3237
                  LINES: 25->1|31->7|31->7|31->7|31->7|33->9|35->11|38->14|38->14|44->20|45->21|45->21|46->22|50->26|50->26|51->27|51->27|51->27|52->28|55->31|55->31|58->34|79->55|79->55|80->56|82->58|82->58|83->59|84->60|84->60|85->61|85->61|85->61|86->62|89->65|89->65|90->66|90->66|92->68|92->68|93->69|93->69|94->70|117->93|117->93|118->94
                  -- GENERATED --
              */
          