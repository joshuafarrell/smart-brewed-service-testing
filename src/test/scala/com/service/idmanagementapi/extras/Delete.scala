package com.service.idmanagementapi.extras

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Delete {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val deleteAll = exec(http("GET /connect/users/${userId}/extra")
    .delete("/connect/users/${userId}/extra")
    .headers(headers)
    .check(status.is(200))
  )
}
