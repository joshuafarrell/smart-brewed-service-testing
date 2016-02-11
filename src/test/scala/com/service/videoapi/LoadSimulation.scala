package com.service.videoapi

import io.gatling.core.Predef._

class LoadSimulation extends Simulation {
/*
  val httpProtocol = http.baseURL("http://localhost:8080/tags")
    .proxy(Proxy("127.0.0.1", 56786).httpsPort(56786))

  val create = scenario("Create")
     .exec()
  )

  var userTotal: Double = 100
  var readUsers: Int = Math.floor(userTotal * .80).toInt
  var updateUsers: Int = Math.floor(userTotal * .10).toInt
  var searchUsers: Int = (userTotal - readUsers - updateUsers).toInt

  setUp(
    read.inject(
      atOnceUsers(updateUsers)
      //rampUsersPerSec(1) to (updateUsers) during (30 seconds)
      //constantUsersPerSec(updateUsers) during (30 seconds)
    )
  ).protocols(httpProtocol)
  */
}