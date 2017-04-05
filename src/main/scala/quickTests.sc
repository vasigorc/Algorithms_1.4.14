import scala.io._

object quickTests {
	class Pair (val tuple: (Int, Int), val sum: Int){
		
		override def toString:String = {s"${tuple._1}, ${tuple._2} with their negatives form sum of 0"}
	}
	
	val a = (-10 to 100) toArray              //> a  : Array[Int] = Array(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3,
                                                  //|  4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 2
                                                  //| 4, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 4
                                                  //| 3, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 6
                                                  //| 2, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 8
                                                  //| 1, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 1
                                                  //| 00)
	
	val solution = for {
		i <- 0 until a.length-2
		j <- i+1 until a.length-2
		val k = j+1; val l = k+1;
		if(a(i)+a(j) == 0-a(k)-a(l))
	} yield (a(i), a(j), a(k), a(l))          //> solution  : scala.collection.immutable.IndexedSeq[(Int, Int, Int, Int)] = Ve
                                                  //| ctor((-9,2,3,4), (-6,1,2,3), (-3,0,1,2))
}