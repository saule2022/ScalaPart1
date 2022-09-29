//
//import scala.annotation.tailrec
//import scala.collection.mutable.ArrayBuffer
//import scala.io.StdIn
//import scala.io.StdIn.readLine
//import scala.language.postfixOps
//import scala.util.{Failure, Random, Success, Try}
//class TicTac(
//    val playerOne:String,
//    val playerTwo: String)
// {
//  var movesArray: ArrayBuffer[Int] = ArrayBuffer() // accumulates players moves, that later need to match with winning
//  //var currentPlayer: String = if (isPlayerOneTurn) playerOne else playerTwo
//  val emptyBoard: Array[Char] = Array('1', '2', '3', '4', '5', '6', '7', '8', '9')
//  val winningSets: Set[Set[Int]] = Set(
//    Set(0, 1, 2),
//    Set(3, 4, 5),
//    Set(6, 7, 8),
//    Set(0, 3, 6),
//    Set(1, 4, 7),
//    Set(2, 5, 8),
//    Set(0, 4, 8),
//    Set(2, 4, 6),
//
//  )
//  val drawSet:Set[Int]=Set(0,1, 2,3,4,5,6,7,8)
//
////  def gameCount(inputMove:Int): Int={
////    val safeMove= inputMove
////    currentState-=safeMove
////    currentState
////  }
////  println(gameCount(currentState))
//
//}
//
//object TicTac extends App{
//  val startingCount:Int  =0
//  var currentState:Int = startingCount
//  val gameEndCondition:Int=9
//  println("Welcome to the Tic Tac Toe Game!")
//  val inputNameOne = readLine("What is your name, Player 1? ")
//  val inputXO = readLine("Please choose X or O. ")
//  val playerOne = if (inputXO.toUpperCase == "X") inputXO.toUpperCase else "O"
//  val playerTwo = if (playerOne == "X") "O" else "X"
//  println(s"Thank you, $inputNameOne. Your symbol is '$playerOne'.")
//  val inputNameTwo = readLine("What is your name, Player 2? ") // press ENTER to play with Computer.
//  println(s"Thank you, $inputNameTwo. Your symbol is '$playerTwo'.")
//  //val isPLayerOneStarting=true
//  var movesArray: ArrayBuffer[Int] = ArrayBuffer()
//  val emptyBoard: Array[Char] = Array('1', '2', '3', '4', '5', '6', '7', '8', '9')
//  val winningSets: Set[Set[Int]] = Set(
//    Set(0, 1, 2),
//    Set(3, 4, 5),
//    Set(6, 7, 8),
//    Set(0, 3, 6),
//    Set(1, 4, 7),
//    Set(2, 5, 8),
//    Set(0, 4, 8),
//    Set(2, 4, 6)
//  )
//  val drawSet:Set[Int]=Set(0,1, 2,3,4,5,6,7,8)
// // printBoard(emptyBoard)
//  //nextTurn(emptyBoard)
//
//val TicTacGame=new TicTac(playerOne, playerTwo, startingCount:Int, gameEndCondition)
//
//   {
//
////    def moves(index:Int):Int={
////      val move=index+1
////      move
////    }
////    def gameCount(nextMove:Int): Int={
////      val safeMove= moves(nextMove)
////      currentState-=safeMove
////      currentState
////    }
//    def showStatus(): Unit ={
//      if (currentState>0) {
//        println(s"There are $currentState matches left.")
//        println(s"It is $playerTwo's turn.")
//      }
//      else{
//        println(s"The game is over. $playerOne has won.")}
//    }
//    showStatus()
//    printBoard(emptyBoard)
//    nextTurn(emptyBoard)
//
//
//    def nextTurn(board: Array[Char]): Unit = {
//      val nextMove = moveInput(board)
//      board(nextMove) = nextPlayer(board)
//      movesArray += nextMove
//      printBoard(board)
//      if (!checkWin(board)) {
//        nextTurn(board)
//      }
//      //else if (board.toSet.isFull)
//      movesArray.toArray
//    }
////    def moves(nextMove:Int):Int={
////      val move=nextMove+1
////      move
////    }
////      val currentState=for ((nextMove, index) <- movesArray) yield index
////      println(index)
////    def gameCount(): Unit = {
////      for ((nextMove, index)<- movesArray.zipWithIndex ) {
////        val currentState=index
////        val move = nextMove
////        println(s"Current state of moves ${currentState + 1} and $move")
////      }
////        movesArray.toArray
////        currentState
////      }
////    println(currentState)
//
////  val myValues = for ((_, value) <- myFavorites) yield value //I am using _ to indicate that key is not needed
////  println(myValues)
////  val myValuesToo = myFavorites.values // same thing as above
////
////  val myKeys = myFavorites.keys.toSeq
//
//    def printMoves(): Array[Int] = {
//      for ((nextMove, index) <- movesArray.zipWithIndex) {
//        val playerName = if (index % 2 == 0) inputNameOne else inputNameTwo
//        val move = nextMove //+ 1
//        val currentState= index
//        println(s"Move ${index + 1}. $playerName took $move")
//      }
//      movesArray.toArray
//    }
//    println(printMoves())
//   println(currentState)
//
//    //TicTacGame.moveInput()
//    def moveInput(board: Array[Char]): Int = {
//      try {
//        val inputMove = readLine("Please enter board position number to move. ").toInt - 1
//        if (inputMove < 0 || inputMove > 8 || !board(inputMove).toString.matches("[1-9]")) {
//          throw new Exception
//        }
//        inputMove
//      } catch {
//        case _: Exception => moveInput(board)
//        //      } catch {
//        //        case_: Exception
//      }
//    }
//
////    //TicTacGame.gameCount()
////    def gameCount(inputMove: Int): Int = {
////      val safeMove = inputMove
////      currentState -= safeMove
////      currentState
////    }
//
//    //   TicTacGame.nextPlayer()
//    def nextPlayer(board: Array[Char]): Char = {
//      val remainingTurns = board.count(_.toString.matches("[1-9]"))
//      val next = if (remainingTurns % 2 == 0) playerTwo.toCharArray.head else playerOne.toCharArray.head
//      next
//    }
//
//    def printBoard(board: Array[Char]): Unit = {
//      print(
//        0 to 2 map { r =>
//          0 to 2 map { c =>
//            board(c + r * 3)
//          } mkString " | "
//        } mkString("\n", "\n—   —   —\n", "\n")
//      )
//      println("\nNext Player is " + nextPlayer(board))
//
//    }
//
//    def checkWin(board: Array[Char]): Boolean = {
//      winningSets.foreach(pattern => {
//        if (pattern.forall(board(_) == board(pattern.head))) {
//          val winnerName = if (board(pattern.head).toString == playerOne) s"$inputNameOne" else s"$inputNameTwo"
//          val loserName = if (board(pattern.head).toString == playerOne) s"$inputNameTwo" else s"$inputNameOne"
//          println(s"\nWinner is $winnerName! Congratulations, $winnerName!")
//          println(s"Better luck next time, $loserName!")
//
//          println("\nGame result saved.")
//          return true
//        }
//        //else if (board(pattern.head).toString == drawSet.forall(pattern).toString)
//        else if (board.toSet==drawSet)
//        //else if (board.pattern.(_.toString.matches("[1-9]"))==drawSet.forall(pattern).toString)
//        println("It is draw!")
//      })
//      false
//    }
//  }
//}
//
//
