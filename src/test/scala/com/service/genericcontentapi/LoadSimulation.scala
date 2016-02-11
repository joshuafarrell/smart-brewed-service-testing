package com.service.genericcontentapi

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class LoadSimulation extends Simulation {

  var userTotal : Double = 100

  var readUsers: Int = Math.floor(userTotal*.80).toInt
  var updateUsers: Int = Math.floor(userTotal*.10).toInt
  var searchUsers: Int = (userTotal - readUsers - updateUsers).toInt

  val httpProtocol = http.baseURL("http://localhost:8080/generic-content-api")
    .proxy(Proxy("127.0.0.1", 56786).httpsPort(56786))

  /*
  80% read
  10% update
  10% search
   */
  val update = scenario("update").exec(
    content.Create.create
  )

  setUp(
    update.inject(atOnceUsers(updateUsers))
  ).protocols(httpProtocol)
}