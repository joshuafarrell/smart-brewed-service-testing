package com.service.idmanagementapi.users

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Delete {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val delete = exec(http("GET /connect/users/${userId}")
    .delete("/connect/users/${userId}")
    .headers(headers)
    .check(status.is(200))
  )
}
