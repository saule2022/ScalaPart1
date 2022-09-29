import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.BeforeAndAfter
class TictacTest extends AnyFunSuite with BeforeAndAfter {


  var TicTac: ScalaTicTacToe = _
  var WinnersLosersDB: WinnersLosersDB = new WinnersLosersDB("src/resources/db/winners_losers.db")
  before {
    //we put whatever  initialization we need for tests in this particular suite
    TicTac = new ScalaTicTacToe(playerOne = "Julija", playerTwo = "Roma")
  }
  test("ticTac4") {
    val playerOne='X'
    val playerTwo='O'
    assert(TicTac.checkWin(Array('0', '1', '2'))===playerOne)
  }
  test("ticTac4nextPlayer") {

    val playerOne='X'
    val playerTwo='O'
    //val board=Array('1', '2', '3', '4', '5', '6', '7', '8', '9')
    assert(TicTac.nextPlayer(Array('1', '2', ' ', ' ', '5', '6', ' ', '8', '9'))===playerTwo)
    //  assert(ticTac4.nextPlayer(board)===playerTwo)
    // assert(ticTac4.nextPlayer(Array('0', '1', '2'))==='O')
  }
  test("WinnersLosersDB.getUserId") {
    val winnerName = "Tina"
    //val loserName ="Robis"
    //val playedDate=
    //winnerName, loserName, playedDate
    assert(WinnersLosersDB.insertResults("Tina", "Robis") === 12)
  }

}