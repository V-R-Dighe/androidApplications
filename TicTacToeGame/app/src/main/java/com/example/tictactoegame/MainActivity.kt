package com.example.tictactoegame

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    var count = 0
    var activePlayer = 1
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()

    fun buttonClick(view: View){
        val selButtObj = view as Button

        count++

        var cellId = 0

        when(selButtObj.id) {

            R.id.button1 ->cellId=1
            R.id.button2 ->cellId=2
            R.id.button3 ->cellId=3
            R.id.button4 ->cellId=4
            R.id.button5 ->cellId=5
            R.id.button6 ->cellId=6
            R.id.button7 ->cellId=7
            R.id.button8 ->cellId=8
            R.id.button9 ->cellId=9
        }
        playGame(cellId,selButtObj)

        findWinner()

        if(count==9){
            eraseCell()
            player1.clear()
            player2.clear()
        }
    }

    fun playGame(cellId:Int,selButtObj:Button){

        if(activePlayer==1){
            player1.add(cellId)
            selButtObj.text = "X"
            selButtObj.setBackgroundColor(Color.parseColor("#800080"))
            selButtObj.setTextColor(Color.WHITE)
            activePlayer = 2
        }else {
            player2.add(cellId)
            selButtObj.text = "O"
            activePlayer = 1
            selButtObj.setBackgroundColor(Color.YELLOW)
            selButtObj.setTextColor(Color.BLACK)
        }
        count++
        selButtObj.isEnabled = false

    }

    fun findWinner(){

        var winner = -1
        if(player1.contains(1) && player1.contains(2) && player1.contains(3)){
            winner = 1
        }

        if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
            winner = 1
        }

        if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
            winner = 1
        }

        if(player1.contains(1) && player1.contains(4) && player1.contains(7)){
            winner = 1
        }

        if(player1.contains(2) && player1.contains(5) && player1.contains(8)){
            winner = 1
        }

        if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
            winner = 1
        }



        if(player2.contains(1) && player2.contains(2) && player2.contains(3)){
            winner = 2
        }

        if(player2.contains(4) && player2.contains(5) && player2.contains(6)){
            winner = 2
        }

        if(player2.contains(7) && player2.contains(8) && player2.contains(9)){
            winner = 2
        }

        if(player2.contains(1) && player2.contains(4) && player2.contains(7)){
            winner = 2
        }

        if(player2.contains(2) && player2.contains(5) && player2.contains(8)){
            winner = 2
        }

        if(player2.contains(3) && player2.contains(6) && player2.contains(9)){
            winner = 2
        }

        if(winner == 1){
            Toast.makeText(this,"Player 1 is the winner",Toast.LENGTH_LONG).show()
            eraseCell()
            count=0
        }
        else if(winner == 2){
            Toast.makeText(this,"Player 2 is the winner",Toast.LENGTH_LONG).show()
            eraseCell()
            count=0
        }
    }

    fun eraseCell()
    {
        activePlayer = 1
        player1.clear()
        player2.clear()
        val button1 = findViewById<Button>(R.id.button1)
        button1.setText("")
        button1.setBackgroundColor(Color.WHITE)
        button1.isEnabled = true

        val button2 = findViewById<Button>(R.id.button2)
        button2.setText("")
        button2.setBackgroundColor(Color.WHITE)
        button2.isEnabled = true

        val button3 = findViewById<Button>(R.id.button3)
        button3.setText("")
        button3.setBackgroundColor(Color.WHITE)
        button3.isEnabled = true

        val button4 = findViewById<Button>(R.id.button4)
        button4.setText("")
        button4.setBackgroundColor(Color.WHITE)
        button4.isEnabled = true

        val button5 = findViewById<Button>(R.id.button5)
        button5.setText("")
        button5.setBackgroundColor(Color.WHITE)
        button5.isEnabled = true

        val button6 = findViewById<Button>(R.id.button6)
        button6.setText("")
        button6.setBackgroundColor(Color.WHITE)
        button6.isEnabled = true

        val button7 = findViewById<Button>(R.id.button7)
        button7.setText("")
        button7.setBackgroundColor(Color.WHITE)
        button7.isEnabled = true

        val button8 = findViewById<Button>(R.id.button8)
        button8.setText("")
        button8.setBackgroundColor(Color.WHITE)
        button8.isEnabled = true

        val button9 = findViewById<Button>(R.id.button9)
        button9.setText("")
        button9.setBackgroundColor(Color.WHITE)
        button9.isEnabled = true

    }

    fun resetAllCell(view: View){
        eraseCell()
    }
}