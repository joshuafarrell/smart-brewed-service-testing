package com.service.taxonomychannelsapi.channel

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Delete {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val byId = exec(http("DELETE_byId")
    .delete("/channel/1")
    .headers(headers)
    .check(status.is(200))

  )

  val extras = exec(http("DELETE_extras")
    .delete("/channel/extras/1")
    .headers(headers)
    .check(status.is(200))

  )
}
