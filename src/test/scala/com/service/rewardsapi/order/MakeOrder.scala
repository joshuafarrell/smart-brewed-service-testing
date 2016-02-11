package com.service.rewardsapi.order

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object MakeOrder {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val create = exec(http("POST /content")
    .post("/content")
    .headers(headers)
    .body(StringBody(
      """{
        	"created_by": 1,
        	"author_id": 1,
        	"type": 1,
        	"title": "Test title"
        }""")).asJSON
    .check(
      jsonPath("$.id").ofType[Int].saveAs("userId")
    )

  )
}
