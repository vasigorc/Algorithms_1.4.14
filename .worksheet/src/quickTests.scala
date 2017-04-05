import scala.io._

object quickTests {
	class Pair (val tuple: (Int, Int), val sum: Int){
		
		override def toString:String = {s"${tuple._1}, ${tuple._2} with their negatives form sum of 0"}
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(225); 
	
	val a = (-10 to 100) toArray;System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(171); 
	
	val solution = for {
		i <- 0 until a.length-2
		j <- i+1 until a.length-2
		val k = j+1; val l = k+1;
		if(a(i)+a(j) == 0-a(k)-a(l))
	} yield (a(i), a(j), a(k), a(l));System.out.println("""solution  : scala.collection.immutable.IndexedSeq[(Int, Int, Int, Int)] = """ + $show(solution ))}
}
