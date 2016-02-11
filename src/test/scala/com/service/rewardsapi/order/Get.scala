package com.service.rewardsapi.order

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Get {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val get = exec(http("GET /rewards/points/user/{userId}")
    .get("/points/user/{userId}")
    .headers(headers)
    .check(status.is(200))
  )

  val addPoints = exec(http("POST /rewards/actions/user/{userId}")
    .post("/actions/user/{userId}")
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
