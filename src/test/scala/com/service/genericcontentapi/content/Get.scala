package com.service.genericcontentapi.content

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Get {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val get = exec(http("GET /content/{id}")
    .get("/content/1")
    .headers(headers)
    .check(status.is(200))
  )
}
