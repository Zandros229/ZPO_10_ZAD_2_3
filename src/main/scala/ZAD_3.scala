
object ZAD_3 {
  def sumOfDiv (x:Int): Int ={
    var sum: Int =1
    for(i<-2 until Math.sqrt(x.toDouble).toInt){
      if(x%i==0) {
        sum+=i
        if (x / i != i)
          sum += x / i
      }
    }
    sum
  }
 def isAmicable(a:Int,b:Int): Boolean =
  (sumOfDiv(a) == b && sumOfDiv(b) == a)

  def main(args: Array[String]): Unit = {
    val x:Int =220
    val y:Int = 284
    var temp =""
    println(isAmicable(x,y))
    assert(isAmicable(x,y)==true,"It's not working")
    
  }
}
