package com.service.tagsapi.tags

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Get {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val get = exec(http("GET /tags")
    .get("/tags/1")
    .headers(headers)
    .check(status.is(200))
  )

  val getAll = exec(http("GET /tags/all")
    .get("/tags/all")
    .headers(headers)
    .check(status.is(200))
  )

  val search = exec(http("GET_tags_by_search")
      .get("/tags/search?name=testthis")
      .headers(headers)
      .check(status.is(200))
  )

  val byJson = exec(http("GET_tags_by_search")
      .get("/tags/json?json=")
      .body(StringBody(
        """{
            "name": "testthis"
           }""")).asJSON
      .headers(headers)
      .check(status.is(200))
  )

}