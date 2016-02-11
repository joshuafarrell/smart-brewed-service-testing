package com.service.idmanagementapi.extras

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Get {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val get = exec(http("GET /connect/users/${userId}/extra")
    .get("/connect/users/${userId}/extra")
    .headers(headers)
    .check(status.is(200))
  )
}
