package Demo

import org.scalatest.{FlatSpec, FunSuite}

/**
  * Created by Abhishek gupta on 2019-04-15
  */

class HelloTest extends FlatSpec {

  "Hello class" should "greet us with Hello before our name" in {
    val hello = new Hello
    assert(hello.sayHello("Abhishek") == "Hello, Abhishek!")
  }

}
