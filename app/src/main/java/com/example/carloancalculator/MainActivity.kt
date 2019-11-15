package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener(){
            val CarPrice = editTextCarPrice.text.toString()
            val DownPayment = editTextDownPayment.text.toString()
            val LoanPeriod = editTextLoanPeriod.text.toString()
            val InterestRate = editTextInterestRate.text.toString()

            val Loan:Double = CarPrice.toDouble() - DownPayment.toDouble()
            val Interest:Double = Loan * InterestRate.toDouble() * LoanPeriod.toDouble()
            val MonthlyRepayment:Double = (Loan + Interest) / LoanPeriod.toDouble() / 12

            textViewLoan.text = "Loan: " + "%.2f".format(Loan)
            textViewInterest.text = "Interest: " + "%.2f".format(Interest)
            textViewMonthlyRepayment.text = "Monthly Payment: " + "%.2f".format(MonthlyRepayment)
        }

        buttonReset.setOnClickListener(){

        }
    }
}
