
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
  <head>
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("images/favicon.png")),format.raw/*9.100*/("""">
  </head>
  <body>
   """),_display_(/*12.5*/content),format.raw/*12.12*/("""
   """),_display_(/*13.5*/scalajs/*13.12*/.html.scripts("client", routes.Assets.versioned(_).toString, name => getClass.getResource(s"/public/$name") != null)),format.raw/*13.128*/("""
  """),format.raw/*14.3*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon May 22 20:13:12 CEST 2017
                  SOURCE: /home/michal/Pulpit/play-with-scalajs-example-master/server/app/views/main.scala.html
                  HASH: 11b99fba07ff63394e15f16ffbf41e0fe597c511
                  MATRIX: 530->1|655->31|683->33|754->78|779->83|863->141|877->147|938->188|1021->245|1035->251|1095->290|1147->316|1175->323|1206->328|1222->335|1360->451|1390->454
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|36->12|36->12|37->13|37->13|37->13|38->14
                  -- GENERATED --
              */
          