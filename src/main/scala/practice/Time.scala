package practice

import java.time.format.DateTimeFormatter
import java.time._

/**
  * Created by jason on 12/04/17.
  */
object Time extends App {



//  2016-09-02T11:43:20.697Z
  // 2017-04-12T16:57:25.985Z
//  println(time)

//  import java.time.LocalDateTime
//  import java.time.format.DateTimeFormatter
//

  // Recommended solution, but throws java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: OffsetSeconds error
//  val FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
//
//  println(LocalDateTime.now(ZoneId.of("UCT")).format(FORMATTER))


  // Ideal solution but Play Form wont accept
//  val time = LocalDateTime.now()
//
//  println(instantFromLocalDateTime(time))


// How DSES does it, but uses Joda date time which doesnt parse the same way
//  val startDate = Instant.now().toString
//    println(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse(startDate))
  //  DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parseDateTime(startDate)

//  import java.time.LocalDateTime
//  import java.time.Month
//  import java.time.format.DateTimeFormatter
//
////  val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
//  val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
////  val dateTime = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30, 33)
//  val dateTime = LocalDateTime.now()
//  val formattedDateTime = dateTime.format(formatter)
//  println(formattedDateTime)
//
//  println(Instant.now())
//



//val startDate = Instant.now().toString
//  println(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse(startDate))


//  DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parseDateTime(startDate)

  val localDate = LocalDate.now()
  val localTime = LocalTime.now()
  println(localTime)

//  val localDateTime = LocalDateTime.of(localDate, localTime)
//  println(instantFromLocalDateTime(localDateTime))
//println(Instant.now())

  def instantFromLocalDateTime(local : LocalDateTime): Instant = local.toInstant(ZoneId.systemDefault().getRules.getOffset(local))

  def instantFromLocalDate(timeType: String, local: LocalDate): ZonedDateTime = {
    timeType match {
      case "startDate" => local.atStartOfDay().atZone(ZoneOffset.UTC)
      case "endDate" => local.atTime(23, 59, 59).atZone(ZoneOffset.UTC)
    }
  }

  val df = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX")

  println(df.format(instantFromLocalDate("startDate", localDate)))

//  println(LocalDateTime.of(LocalDate.now().minusDays(1), LocalTime.MIN))
}
