# smart-brewed-service-testing
Gatling with Scala hooked to a local graphite reporter running in virtual box ubuntu

To run use cmd "mvn gatling:execute -e -Dgatling.simulationClass=com.http.sheknows.FunctionalSimulation -Dusers=1 -Denv=http://staging.sheknows.com"
