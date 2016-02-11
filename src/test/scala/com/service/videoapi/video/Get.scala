package com.service.videoapi.video

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Get {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val byIdOrSlug = exec(http("GET_byIdOrSlug")
    .get("/videos/1")
    .headers(headers)
    .check(status.is(200))
  )

  val search = exec(http("GET_search")
    .get("/videos/search")
    .headers(headers)
    .check(status.is(200))
  )

  val byJson = exec(http("GET_byJson")
      .get("/videos/json")
      .headers(headers)
      .check(status.is(200))
  )

}