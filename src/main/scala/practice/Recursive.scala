package practice

/**
  * Created by jason on 06/04/17.
  */
object Recursive {


//  case class VendorCsvResultsModel(vendors: Int, messageClasses: Int, submissions: Int)
//
//  object VendorCsvResultsModel {
//    val empty = VendorCsvResultsModel(0,0,0)
//
//    def resultsToCount(model: Option[Seq[VendorMessageResultsModel]]): VendorCsvResultsModel = {
//      if (model.isDefined) {
//        recursive(model.get, 0, ArrayBuffer.empty, ArrayBuffer.empty)
//      } else {
//        VendorCsvResultsModel.empty
//      }
//    }
//
//    def recursive(model: Seq[VendorMessageResultsModel], submissions: Int,
//                  messages: ArrayBuffer[String], vendors: ArrayBuffer[String]): VendorCsvResultsModel = {
//      model match {
//        case h::t => recursive(t,submissions + totalSubmissions(h),messages :+ h.messageClass,vendors :+ h.vendorId.getOrElse("unique"))
//        case Nil =>
//          val messageCount = uniqueStrings(messages)
//          val vendorCount = uniqueStrings(vendors)
//          VendorCsvResultsModel(vendorCount,messageCount,submissions)
//      }
//    }
//
//    def totalSubmissions(model: VendorMessageResultsModel): Int ={
//      model.states.size match {
//        case 2 => model.states.head.count + model.states.last.count
//        case 0 => 0
//        case _ => model.states.head.count
//      }
//    }
//
//    def uniqueStrings(arrayBuffer: ArrayBuffer[String]): Int ={
//      val distinct = arrayBuffer.distinct
//      val filtered = distinct.filter(_.nonEmpty)
//      filtered.length
//    }
//
//  }

  //    def resultsToCount(model: Option[Seq[VendorMessageResultsModel]]): VendorCsvResultsModel = {
  //
  //      if (model.isDefined) {
  //
  //        def recursive(model: Seq[VendorMessageResultsModel], submissions: Int,
  //                      messages: ArrayBuffer[String], vendors: ArrayBuffer[String]): VendorCsvResultsModel = {
  //          val head = model.head
  //          val newSubmissions = submissions + totalSubmissions(head)
  //          val newMessages = messages :+ head.messageClass
  //          val newVendors = vendors :+ head.vendorId.getOrElse("unique")
  //
  //          val tail = model.tail
  //
  //          if (tail.isEmpty) {
  //            val vendorCount = uniqueStrings(newVendors)
  //            val messageCount = uniqueStrings(newMessages)
  //            VendorCsvResultsModel(vendorCount, messageCount, submissions)
  //          } else {
  //            recursive(tail, newSubmissions, newMessages, newVendors)
  //          }
  //        }
  //        recursive(model.get, 0, ArrayBuffer.empty, ArrayBuffer.empty)
  //      } else {
  //        VendorCsvResultsModel.empty
  //      }
  //    }

}
