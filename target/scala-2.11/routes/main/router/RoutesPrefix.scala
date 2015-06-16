
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kou/site/elecon/conf/routes
// @DATE:Thu Jun 04 21:16:29 JST 2015


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
