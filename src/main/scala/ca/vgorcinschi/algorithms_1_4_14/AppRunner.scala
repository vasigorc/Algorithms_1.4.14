package ca.vgorcinschi.algorithms_1_4_14

import scala.io.Source

/*
 * The task is to implement
 * a solution for the 4-sum problem:
 * Given an array find all groups of 4 integers
 * that in sum give 0
 */
object FourSumFast extends App{
  val thirtyTwoK = Source.fromFile("src/main/resources/32Kints.txt")
  .getLines().map(_ toInt).toArray
  
  val sorted = thirtyTwoK.sorted
  val N = sorted.length
  
  //counts total occurences of 4 sums
  var counter = 0

  for {
		i <- 0 until N-2
		j <- i+1 until N-2
		val k = j+1; val l = k+1;
		if(sorted(i)+sorted(j) == 0-sorted(k)-sorted(l))
	} counter+=1
	
	println(s"$counter groups of 4 were identified in 32Kints.txt")
}