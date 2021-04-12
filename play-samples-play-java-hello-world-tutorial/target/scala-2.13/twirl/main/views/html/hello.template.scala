
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Hello")/*1.15*/ {_display_(Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<section id="content">
    <div class="wrapper doc">
        <article>
            <h1>Hello World</h1>
        </article>
        <aside>
            """),_display_(/*8.14*/commonSidebar()),format.raw/*8.29*/("""
        """),format.raw/*9.9*/("""</aside>
    </div>
</section>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-04-08T17:40:35.794924
                  SOURCE: /Users/minhnguyen/Desktop/playFrameWork/play-samples-play-java-hello-world-tutorial/app/views/hello.scala.html
                  HASH: 5bc6dbd121ddf8fee2f5547f3e7997668cf5bff3
                  MATRIX: 989->1|1010->14|1049->16|1076->17|1254->169|1289->184|1324->193
                  LINES: 32->1|32->1|32->1|33->2|39->8|39->8|40->9
                  -- GENERATED --
              */
          