package com.service.taxonomychannelsapi.Channel

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Get {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val byId = exec(http("GET_byId")
    .get("/channel/1")
    .headers(headers)
    .check(status.is(200))
  )

  val find = exec(http("GET_find")
    .get("/channel/find")
    .headers(headers)
    .check(status.is(200))
  )

  val byJson = exec(http("GET_byJson")
      .get("/channel/json")
      .headers(headers)
      .check(status.is(200))
  )

  val byMatch = exec(http("GET_match")
    .get("/channel/match")
    .headers(headers)
    .check(status.is(200))
  )
}