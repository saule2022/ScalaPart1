//import scala.io.StdIn.readLine
//import scala.util.Random
//
//class TicTacToe {
//  // intro + initial input from players
//  println("Welcome to the Tic Tac Toe Game!")
//  val inputNameOne: String = readLine("What is your name, Player 1? ")
//  val inputXO: String = readLine("Please choose X or O. ")
//  val playerOne: String = if (inputXO.toUpperCase == "X") inputXO.toUpperCase else "O"
//  val playerTwo: String = if (playerOne == "X") "O" else "X"
//  println(s"Thank you, $inputNameOne. Your symbol is '$playerOne'.")
//  var inputNameTwo: String = readLine("What is your name, Player 2? Press ENTER if Player 2 is Computer. ")
//  if (inputNameTwo == "") inputNameTwo = "Computer"
//  println(s"Thank you, $inputNameTwo. Your symbol is '$playerTwo'.")
//
//  // starting board positions + sets necessary to win
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
//
//  // initiating game
//  printBoard(emptyBoard)
//  nextTurn(emptyBoard)
//
//  // defining who's turn it is (human one, human two, computer) and requesting input
//  def nextTurn(board: Array[Char]): Unit = {
//    val remainingTurns = board.count(_.toString.matches("[1-9]"))
//    val next = if(remainingTurns%2 == 0) playerTwo.toCharArray.head else playerOne.toCharArray.head
//    val nextMove = if (inputNameTwo == "Computer" && next == playerTwo.toCharArray.head) computerInput(board) else moveInput(board)
//    board(nextMove) = nextPlayer(board)
//    printBoard(board)
//    if (!checkWin(board)) {
//      nextTurn(board)
//
//    }
//  }
//
//  // computer's input (if it's game human vs. computer)
//  def computerInput(board: Array[Char]): Int = {
//    val input = Random.nextInt(9).toString
//    if (input.matches("[1-9]")) {
//      val move = input.toInt -1
//      if (board(move).isDigit) {
//        move
//      } else {
//        computerInput(board)
//      }
//    } else {
//      computerInput(board)
//    }
//  }
//
//  // human player's input (human one or human two)
//  def moveInput(board: Array[Char]): Int = {
//    val input = readLine("Enter your board position number to move (between 1 and 9), player "+nextPlayer(board)+ " !")
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
//  // calling next player
//  def nextPlayer(board: Array[Char]): Char = {
//    val remainingTurns = board.count(_.toString.matches("[1-9]"))
//    val next = if(remainingTurns%2 == 0) playerTwo.toCharArray.head else playerOne.toCharArray.head
//    next
//
//  }
//
//  // printing board
//  def printBoard(board: Array[Char]): Unit = {
//    println(
//      0 to 2 map { r =>
//        0 to 2 map { c =>
//          board(c + r*3)
//        } mkString " | "
//      } mkString ("\n", "\n—   —   —\n", "\n")
//    )
//    //println("\nNext Player is " + nextPlayer(board))
//  }
//
//  // extending class for databases
//  class WinnersLosersLists extends TicTacToe
//
//  // checking if it's win (saving results in that case) or forcing game to continue
//  def checkWin(board: Array[Char]): Boolean = {
//    winningSets.foreach(pattern=>{
//      if(pattern.forall(board(_) == board(pattern.head))) {
//        val winnerName = if (board(pattern.head).toString == playerOne) s"$inputNameOne" else s"$inputNameTwo"
//        val loserName = if (board(pattern.head).toString == playerOne) s"$inputNameTwo" else s"$inputNameOne"
//        println(s"\nWinner is ${board(pattern.head)}! Congratulations, $winnerName!")
//        println(s"Better luck next time, $loserName!")
//        println("\nGame result saved.")
//        return true
//      }
//      else if(board.count(_.toString.matches("[1-9]")) == 0) {
//        println("It's a draw! Congratulations both!")
//        return true
//      }
//    })
//    false
//  }
//}
//
//object ComputerLogic extends App{
//  val game = new TicTacToe
//}
