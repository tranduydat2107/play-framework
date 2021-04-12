// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/minhnguyen/Desktop/playFrameWork/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Fri Apr 09 10:28:13 ICT 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
