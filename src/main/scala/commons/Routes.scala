package commons

import com.typesafe.config.ConfigFactory

/**
  * Created by dgjones on 26/07/16.
  */
object Routes {

  val conf = ConfigFactory.load
  val host = "http://localhost:3000"

  val routeToPosts = s"$host/posts"
  def routeToPost(id: Int) = s"$host/posts/$id"
  val routeToProfile = s"$host/profile"

}
