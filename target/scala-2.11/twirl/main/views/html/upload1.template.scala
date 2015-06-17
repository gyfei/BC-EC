
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object upload1_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class upload1 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<div class="clearfix error" id="username_field">
    <label for="username">Username:</label>
    <div class="input">
        <input type="text" name="username" id="username" value="">
        <span class="help-inline">This field is required!, Another error</span>
        <span class="help-block">Required, Another constraint</span> 
    </div>
</div>

<ul class="nav nav-tabs">
    <li role="presentation" class="active"><a href="#">Home</a></li>
    <li role="presentation"><a href="#">Profile</a></li>
    <li role="presentation"><a href="#">Messages</a></li>
</ul>

<form role="form">
  <div class="form-group">
    <label for="email">Email address:</label>
    <input type="email" class="form-control" id="email">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" id="pwd">
  </div>
  <div class="checkbox">
    <label><input type="checkbox"> Remember me</label>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object upload1 extends upload1_Scope0.upload1
              /*
                  -- GENERATED --
                  DATE: Wed Jun 17 12:23:12 JST 2015
                  SOURCE: /home/kou/git/BC-EC/app/views/upload1.scala.html
                  HASH: 5cfcc173ac3e8949919fc6724493103ff9819bc7
                  MATRIX: 613->2
                  LINES: 25->3
                  -- GENERATED --
              */
          