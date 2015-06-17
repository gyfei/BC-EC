
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kou/git/BC-EC/conf/routes
// @DATE:Tue Jun 16 15:54:00 JST 2015


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
