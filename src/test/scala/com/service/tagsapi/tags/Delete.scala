package com.service.tagsapi.tags

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Delete {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val delete = exec(http("DELETE /tags/{tagId}")
    .put("/tags/1")
    .headers(headers)
    .body(StringBody(
      """{
          "name": "testme"
        }""")).asJSON
    .check(status.is(200))

  )
}
