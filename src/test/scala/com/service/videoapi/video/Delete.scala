package com.service.videoapi.video

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Delete {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val byId = exec(http("DELETE_byId")
    .delete("/videos/1")
    .headers(headers)
    .check(status.is(200))

  )

}
