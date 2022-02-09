package verveproject

import io.circe.{Decoder, Encoder, HCursor, parser}
import scala.collection.immutable.List

sealed trait verveProject {}
case class Clicks(impression_id: String, revenue: Double)
case class Impressions(app_id: Int, advertiser_id: Int, country_code: String, id: String)

object verveProject {

    def dataPoint(f1: String, f2: String): Unit = {

      // JSON files reading
      val click_source = scala.io.Source.fromURL(f1)
      val impression_source = scala.io.Source.fromURL(f2)

      val click_input = try click_source.mkString.stripMargin
      finally click_source.close()
      val impression_input = try impression_source.mkString
      finally impression_source.close()

      val click_json = ujson.read(click_input)
      val impression_json = ujson.read(impression_input)

      println(click_json(1)("revenue"))
      println("\n END OF CLICK DATA \n")
      println(impression_json)
      println("\n END OF IMPRESSION DATA \n")

      // ENCODING CLICK AND IMPRESSION DATA
      implicit val encodeClicks: Encoder[Clicks] =
        Encoder.forProduct2("impression_id", "revenue")(c => (c.impression_id, c.revenue))

      implicit val encodeImpressions: Encoder[Impressions] =
        Encoder.forProduct4("app_id", "advertiser_id", "country_code", "id")(i => (i.app_id, i.advertiser_id, i.country_code, i.id))

      // DECODING CLICK AND IMPRESSION DATA
      implicit val clicksDecoder: Decoder[Clicks] =
        (hCursor: HCursor) => {
          for {
            impression_id <- hCursor.get[String]("impression_id")
            revenue <- hCursor.get[Double]("revenue")
          } yield Clicks(impression_id, revenue)
        }
      val decodingClicks = parser.decode[List[Clicks]](click_input)
      decodingClicks match {
        case Right(click) => click.foreach(println)
        case Left(error) => println(error.getMessage)
      }
      println()
      println("END OF CLICKS DATA-STREAM PARSING\n")

      implicit val impressionsDecoder: Decoder[Impressions] =
        (hCursor: HCursor) => {
          for {
            app_id <- hCursor.get[Int]("app_id")
            advertiser_id <- hCursor.get[Int]("advertiser_id")
            country_code <- hCursor.get[String]("country_code")
            id <- hCursor.get[String]("id")
          } yield Impressions(app_id, advertiser_id, country_code, id)
        }
      val decodingImpressions = parser.decode[List[Impressions]](impression_input)
      decodingImpressions match {
        case Right(impression) => impression.distinct.foreach(println)
        case Left(error) => println(error.getMessage)
      }
      println()
      println("END OF CLICKS IMPRESSION-STREAM PARSING\n")


    }

    // Start of Main Function
    def main(args: Array[String]): Unit = {

      val url_1 = "https://gist.githubusercontent.com/mpasa/9a710abe1f93335fa00dddae3d6e9401/raw/b573f05afc5ee0915ba1b0c3d56734d571fe3a56/clicks.json"
      val url_2 = "https://gist.githubusercontent.com/mpasa/9a710abe1f93335fa00dddae3d6e9401/raw/b573f05afc5ee0915ba1b0c3d56734d571fe3a56/impressions.json"
      // Call to Data Point
      dataPoint(url_1, url_2)

    } // End of Main Function

 } // End of VerveProject

