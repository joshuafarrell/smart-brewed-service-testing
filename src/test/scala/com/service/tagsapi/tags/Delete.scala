package com.service.tagsapi.tags

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Delete {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val byId = exec(http("DELETE_byId")
    .delete("/tags/1")
    .headers(headers)
    .check(status.is(200))

  )
}
