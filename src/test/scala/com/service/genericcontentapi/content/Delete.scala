package com.service.genericcontentapi.content

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Delete {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val delete = exec(http("DELETE /content/{id}")
    .delete("/content/1")
    .headers(headers)
    .check(status.is(200))
  )
}
