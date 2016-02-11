package com.service.taxonomychannelsapi.Channel

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Update {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val byId = exec(http("PATCH_byId")
    .patch("/channel/1")
    .headers(headers)
    .body(StringBody(
      """{
          "name": "testme"
          "slug": "testslug"
          "description": "updated description"
        }""")).asJSON
    .check(status.is(200))

  )
}
