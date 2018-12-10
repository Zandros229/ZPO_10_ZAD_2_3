import java.lang.NumberFormatException

object ZAD2 {
  def main(args: Array[String]): Unit = {
    val aritmetic: String = "-3 + 4 - 1 + 1 + 12 - 5 + 6"
//    println(aritmetic)
    var res: Int = 0
    var next: Boolean=true
    var temp: Int=0;

    aritmetic.split(" ").foreach(c => {
      c match {
        case "+" => next=true
        case "-" => next=false
        case _ => {
          try{
            temp=c.toInt
          next match {
            case true => res += temp
            case false => res -= temp
          }}
          catch{
            case ex:NumberFormatException =>
              throw new IllegalArgumentException
          }
        }
      }
    })
    println(res)
  }
}
