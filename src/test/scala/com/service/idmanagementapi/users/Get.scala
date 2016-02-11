package com.service.idmanagementapi.users

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Get {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val get = exec(http("GET /connect/users/${userId}")
    .get("/connect/users/${userId}")
    .headers(headers)
    .check(status.is(200))
  )
}
