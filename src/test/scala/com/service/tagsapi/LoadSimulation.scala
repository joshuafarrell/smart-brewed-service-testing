package com.service.tagsapi

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

class LoadSimulation extends Simulation {

  val httpProtocol = http.baseURL("http://localhost:8080/tags")
    //.proxy(Proxy("127.0.0.1", 56786).httpsPort(56786))

  val create = scenario("Create")
     .exec(tags.Create.create)
  val update = scenario("Update")
    .during(10 seconds) {
      exec(tags.Update.update)
    }
  val read = scenario("Get")
    .during(10 minutes) {
      exec(tags.Get.get)
    }

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
}