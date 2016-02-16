package com.service.rewardsapi.order

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Get {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val pointsByUserId = exec(http("GET_points")
    .get("/points/user/1")
    .headers(headers)
    .check(status.is(200))
  )
}
