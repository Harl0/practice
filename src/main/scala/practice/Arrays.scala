package practice

/**
  * Created by Jason on 02/04/2017.
  */
object Arrays extends App {

  def printArray[K](array: Array[K]) = array.mkString("Array(", ", ", ")")

  //Mutable array of type Array[Int]
  val array1 = Array(1, 2, 3)
  printArray(array1)

  //Mutable array of type Array[Any]
  val array2 = Array("a", 2, true)
  printArray(array2)

  //Mutable array of type Array[String]
  val array3 = Array("a", "b", "c")
  printArray(array3)

  //Access items using (index) not [index]
  val itemAtIndex0 = array3(0)

  //Concatenation using the ++ operator,
  //Prepending items using +: and appending using :+
  val concatenated = "prepend" +: (array1 ++ array2) :+ "append"

  //Finding an index of an item
  array3.indexOf("b")


  //Find (stops when item is found)
  val personArray = Array(("Alice", 1), ("Bob", 2), ("Carol", 3))

  def findByName(name: String): (String, Int) = {
    personArray.find(_._1 == name)
      .getOrElse(("David", 4))
  }

  val findBob = findByName("Bob")
  //  println(findBob)

  val findEli = findByName("Eli")
  //  println(findEli)

  val bobFound = findBob._2
  //  println(bobFound)

  val token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJjcmVkMTIzIiwiYXVkIjoiYXV0aDAxIiwiYmFzOnRva2VuX2lkZW50aWZpZXIiOiJiUUN3UUxaTVJsc0RuOHRGWUdrQTB1YWt6UzZ6aG82RSIsImJhczp0cmFuc2l0aW9uOmdnVG9rZW4iOiJUV2xrZDJGNUlIVndiMjRnZEdobElHcHZkWEp1WlhrZ2IyWWdiM1Z5SUd4cFptVU5DaUFnU1NCbWIzVnVaQ0J0ZVhObGJHWWdkMmwwYUdsdUlHRWdabTl5WlhOMElHUmhjbXNzRFFvZ0lFWnZjaUIwYUdVZ2MzUnlZV2xuYUhSbWIzSjNZWEprSUhCaGRHaDNZWGtnYUdGa0lHSmxaVzRnYkc5emRDNE5DZzBLUVdnZ2JXVWhJR2h2ZHlCb1lYSmtJR0VnZEdocGJtY2dhWFFnYVhNZ2RHOGdjMkY1RFFvZ0lGZG9ZWFFnZDJGeklIUm9hWE1nWm05eVpYTjBJSE5oZG1GblpTd2djbTkxWjJnc0lHRnVaQ0J6ZEdWeWJpd05DaUFnVjJocFkyZ2dhVzRnZEdobElIWmxjbmtnZEdodmRXZG9kQ0J5Wlc1bGQzTWdkR2hsSUdabFlYSXVEUW9OQ2xOdklHSnBkSFJsY2lCcGN5QnBkQ3dnWkdWaGRHZ2dhWE1nYkdsMGRHeGxJRzF2Y21VN0RRb2dJRUoxZENCdlppQjBhR1VnWjI5dlpDQjBieUIwY21WaGRDd2dkMmhwWTJnZ2RHaGxjbVVnU1NCbWIzVnVaQ3dOQ2lBZ1UzQmxZV3NnZDJsc2JDQkpJRzltSUhSb1pTQnZkR2hsY2lCMGFHbHVaM01nU1NCellYY2dkR2hsY21VdURRb05Da2tnWTJGdWJtOTBJSGRsYkd3Z2NtVndaV0YwSUdodmR5QjBhR1Z5WlNCSklHVnVkR1Z5WldRc0RRb2dJRk52SUdaMWJHd2dkMkZ6SUVrZ2IyWWdjMngxYldKbGNpQmhkQ0IwYUdVZ2JXOXRaVzUwRFFvZ0lFbHVJSGRvYVdOb0lFa2dhR0ZrSUdGaVlXNWtiMjVsWkNCMGFHVWdkSEoxWlNCM1lYa3VEUW9OQ2tKMWRDQmhablJsY2lCSklHaGhaQ0J5WldGamFHVmtJR0VnYlc5MWJuUmhhVzRuY3lCbWIyOTBMQTBLSUNCQmRDQjBhR0YwSUhCdmFXNTBJSGRvWlhKbElIUm9aU0IyWVd4c1pYa2dkR1Z5YldsdVlYUmxaQ3dOQ2lBZ1YyaHBZMmdnYUdGa0lIZHBkR2dnWTI5dWMzUmxjbTVoZEdsdmJpQndhV1Z5WTJWa0lHMTVJR2hsWVhKMExBMEtEUXBWY0hkaGNtUWdTU0JzYjI5clpXUXNJR0Z1WkNCSklHSmxhR1ZzWkNCcGRITWdjMmh2ZFd4a1pYSnpMQTBLSUNCV1pYTjBaV1FnWVd4eVpXRmtlU0IzYVhSb0lIUm9ZWFFnY0d4aGJtVjBKM01nY21GNWN3MEtJQ0JYYUdsamFDQnNaV0ZrWlhSb0lHOTBhR1Z5Y3lCeWFXZG9kQ0JpZVNCbGRtVnllU0J5YjJGa0xnMEtEUXBVYUdWdUlIZGhjeUIwYUdVZ1ptVmhjaUJoSUd4cGRIUnNaU0J4ZFdsbGRHVmtEUW9nSUZSb1lYUWdhVzRnYlhrZ2FHVmhjblFuY3lCc1lXdGxJR2hoWkNCbGJtUjFjbVZrSUhSb2NtOTFaMmh2ZFhRTkNpQWdWR2hsSUc1cFoyaDBMQ0IzYUdsamFDQkpJR2hoWkNCd1lYTnpaV1FnYzI4Z2NHbDBaVzkxYzJ4NUxnMEtEUXBCYm1RZ1pYWmxiaUJoY3lCb1pTd2dkMmh2TENCM2FYUm9JR1JwYzNSeVpYTnpablZzSUdKeVpXRjBhQ3dOQ2lBZ1JtOXlkR2dnYVhOemRXVmtJR1p5YjIwZ2RHaGxJSE5sWVNCMWNHOXVJSFJvWlNCemFHOXlaU3dOQ2lBZ1ZIVnlibk1nZEc4Z2RHaGxJSGRoZEdWeUlIQmxjbWxzYjNWeklHRnVaQ0JuWVhwbGN6c05DZzBLVTI4Z1pHbGtJRzE1SUhOdmRXd3NJSFJvWVhRZ2MzUnBiR3dnZDJGeklHWnNaV1ZwYm1jZ2IyNTNZWEprTEEwS0lDQlVkWEp1SUdsMGMyVnNaaUJpWVdOcklIUnZJSEpsTFdKbGFHOXNaQ0IwYUdVZ2NHRnpjdzBLSUNCWGFHbGphQ0J1WlhabGNpQjVaWFFnWVNCc2FYWnBibWNnY0dWeWMyOXVJR3hsWm5RdSIsImJhczpyb2xlcyI6WyJBZG1pbmlzdHJhdG9yIiwiVXNlciJdLCJiYXM6dHJ1c3RGaW5nZXJQcmludCI6Ijk5OUVDRDJBLUM3Q0MtNEU1OS04NTVCLUU3MDhCNDlCRTE3QiIsImF1dGhfdGltZSI6MTQ5ODcyMjg2MywiaXNzIjoiaHR0cDpcL1wvYmFzLXd3dyIsImJhczpncm91cElkIjoiMTIzNDUiLCJleHAiOjE0OTg3MjY0NjMsImlhdCI6MTQ5ODcyMjg2MywiYmFzOmdnLWxlZ2FjeTpyZWdpc3RyYXRpb25DYXRlZ29yeSI6IkFnZW50In0.A9Ldj0p_whCz-x9BSdHps1yRPdqoX6rT6ZuPNIPU6vew2x1e9mGaEi4Ggvb7rUquesmVyOhF5CN7AOIeJetSEqw33iRoE2HPOjf8ELpfmcgZd2xst3e_ypcbAWzVy5wIPGJ_6b2RPutjVNPfv6mNkAvRXr4btqM87pUwNJ0Qm7A"
  val tokenSplit = token.split('.')

  //for (x <- tokenSplit) {
  //  println(x)
  //}

  val firstElement = tokenSplit(2)
  println(firstElement)

  returnFirstString(tokenSplit, 0)

  def returnFirstString(a: Array[String], element: Int): Option[String] = {
    if (a.isEmpty) {
      None
    }
    else {
      val res = Some(a(element))
      res
    }
  }

  if (token.contains("eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9")) {
    println("token contains true")
  }

  //  println(tokenSplit)
  //  val s = "eggs, milk, butter, Coco Puffs"
  //  println(s.split(","))
}
