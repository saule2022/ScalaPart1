//import scala.collection.mutable.ArrayBuffer
//import scala.io.StdIn.readLine
//
//import scala.io.StdIn
//import scala.language.postfixOps
//
//class TicTacToe (    val playerOne:String,
//                     val playerTwo: String,
//                     val startingCount:Int=0,
//                     val gameEndCondition:Int=9,
//                     var isPlayerOneTurn:Boolean = true){
//  var currentState: Int = startingCount
//  var movesArray: ArrayBuffer[Int] = ArrayBuffer() // accumulates players moves, that later need to match with winning
//  var currentPlayer: String = if (isPlayerOneTurn) playerOne else playerTwo
//  val emptyBoard: Array[Char] = Array('1', '2', '3', '4', '5', '6', '7', '8', '9')
//  println("Welcome to the Tic Tac Toe Game!")
//  val inputNameOne = readLine("What is your name, Player 1? ")
//  val inputXO = readLine("Please choose X or O. ")
////  val playerOne = if (inputXO.toUpperCase == "X") inputXO.toUpperCase else "O"
////  val playerTwo = if (playerOne == "X") "O" else "X"
////  println(s"Thank you, $inputNameOne. Your symbol is '$playerOne'.")
//  val inputNameTwo = readLine("What is your name, Player 2? Press ENTER if Player 2 is Computer. ")
//  println(s"Thank you, ${if (inputNameTwo == "") "Computer" else inputNameTwo }. Your symbol is '$playerTwo'.")
//
////  val emptyBoard: Array[Char] = Array('1', '2', '3', '4', '5', '6', '7', '8', '9')
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
//
//printBoard(emptyBoard)
// // nextTurn(emptyBoard)
//
//  def nextTurn(board: Array[Char]): Unit = {
//    val nextMove = moveInput(board)
//    board(nextMove) = nextPlayer(board)
//    printBoard(board)
//    if (!checkWin(board)) {
//      nextTurn(board)
//    }
//  }
//  def moveInput(board: Array[Char]): Int = {
//    val input = readLine("Enter your board position number to move (between 1 and 9). ")
//    if (input.matches("[1-9]")) {
//      val move = input.toInt -1
//      if (board(move).isDigit) {
//        move
//      } else {
//        println("That position is already taken. Try again.")
//        moveInput(board)
//      }
//    } else {
//      println("Your choice must be an integer between 1 and 9.")
//      moveInput(board)
//    }
//  }
//
//  def nextPlayer(board: Array[Char]): Char = {
//    val remainingTurns = board.count(_.toString.matches("[1-9]"))
//    val next = if(remainingTurns%2 == 0) playerTwo.toCharArray.head else playerOne.toCharArray.head
//    next
//  }
//  def printBoard(board: Array[Char]): Unit = {
//    println(
//      0 to 2 map { r =>
//        0 to 2 map { c =>
//          board(c + r*3)
//        } mkString " | "
//      } mkString ("\n", "\n—   —   —\n", "\n")
//    )
//    println("\nNext Player is " + nextPlayer(board))
//  }
//
//  class WinnersLosersLists extends TicTacToe(playerOne, playerTwo, startingCount, gameEndCondition, isPlayerOneTurn)
//
//  def checkWin(board: Array[Char]): Boolean = {
//    winningSets.foreach(pattern=>{
//      if(pattern.forall(board(_) == board(pattern.head))) {
//        val winnerName = if (board(pattern.head).toString == playerOne) s"$inputNameOne" else s"$inputNameTwo"
//        val loserName = if (board(pattern.head).toString == playerOne) s"$inputNameTwo" else s"$inputNameOne"
//        println(s"\nWinner is ${board(pattern.head)}! Congratulations, $winnerName!")
//        println(s"Better luck next time, $loserName!")
//        println("\nGame result saved.")
//        val dbPath = "src/resources/TicTacToeFiles/db/winnerslosers.db"
////        val db = new WinnersLosersList(dbPath)
////        db.migrate()
////        db.insertResults(winnerName, loserName)
////        db.connection.close()
//        return true
//      }
//    })
//    false
//  }
//  def gameCount(): Unit = {
//    for ((nextMove, index)<- movesArray.zipWithIndex ) {
//      val currentState=index+1
//      val move = nextMove
//      println(s"Current state of moves ${currentState + 1} and $move")
//    }
//    movesArray.toArray
//    currentState
//  }
//  println(movesArray.toArray)
//  //println(currentState)
//
//  def showStatus(): Unit ={
//    if (currentState>0) {
//      println(s"There are $currentState matches left.")
//      println(s"It is $playerTwo's turn.")
//    }
//    else{
//      println(s"The game is over. $playerOne has won.")}
//  }
//  def isGameActive(): Boolean = {
//    currentState < gameEndCondition
//  }
//}
//object Game extends App{
//  val startingCount:Int  =0
//  var currentState:Int = startingCount
//  val gameEndCondition:Int=9
//  println("Welcome to the Tic Tac Toe Game!")
//  val inputNameOne = readLine("What is your name, Player 1? ")
//  val inputXO = readLine("Please choose X or O. ")
//  val playerOne = if (inputXO.toUpperCase == "X") inputXO.toUpperCase else "O"
//  val playerTwo = if (playerOne == "X") "O" else "X"
////  println(s"Thank you, $inputNameOne. Your symbol is '$playerOne'.")
////  val inputNameTwo = readLine("What is your name, Player 2? ") // press ENTER to play with Computer.
////  println(s"Thank you, $inputNameTwo. Your symbol is '$playerTwo'.")
//  val isPLayerOneStarting=true
//  var movesArray: ArrayBuffer[Int] = ArrayBuffer()
//  val emptyBoard: Array[Char] = Array('1', '2', '3', '4', '5', '6', '7', '8', '9')
//
//  val game = new TicTacToe(playerOne, playerTwo, startingCount:Int)
//    while (game.isGameActive()) {
//
//      game.nextTurn(board = emptyBoard)
//      game.moveInput(board = emptyBoard)
//      game.nextPlayer(board = emptyBoard )
//      game.printBoard(board=emptyBoard )
//      game.checkWin(board=emptyBoard )
//      //game.gameCount()
//    //println(game.movesArray())
//      game.showStatus()
//
//  }
//}
