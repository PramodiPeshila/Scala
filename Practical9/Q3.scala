object NameFormatter {
  
  def toUpper(name: String): String = name.toUpperCase

  def toLower(name: String): String = name.toLowerCase

  def formatNames(name: String)(formatFunction: String => String): String = formatFunction(name)

  def main(args: Array[String]): Unit = {
    val formattedNames = Seq(
      formatNames("Benny")(toUpper),
      formatNames("Niroshan")(name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase),
      formatNames("Saman")(toLower),
      formatNames("Kumara")(name => name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1).toLowerCase + name.substring(name.length - 1).toUpperCase)
    )

    formattedNames.foreach(println)
  }
}
