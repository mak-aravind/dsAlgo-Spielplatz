package org.mak.easy
import org.scalatest._
class GreetTestSpec extends featurespec.AnyFeatureSpec with GivenWhenThen {
  Feature("when greet application asked for greeting should greet"){
    Scenario("When client invokes greet they should get a greet message"){
      Given("A greeting application")
        val app = new Greet
      When("greeting invoked it should get a greet")
        val result = app.greeting()
      Then("the greet should not be null")
        assert(null != result)
    }
  }
}
