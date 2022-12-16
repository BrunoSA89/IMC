package com.example.pesoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import com.example.pesoimc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //uma variavel privada com gradle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // transforma xml em kt para compreender

        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root

        // usando binding como padrao

        setContentView(view)
        //conteudo da visualizacao

        binding.buttonCalc.setOnClickListener {
            calcularImc()
        }
    }

    fun calcularImc() {
        var peso: Double = binding.editTextTextPersonName.text.toString().toDouble()
        var altura: Double = binding.editTextTextPersonName2.text.toString().toDouble()

        var resultado =  peso / (altura * altura)

//        binding.result.setText("O IMC é %.2f ".format(resultado) )

        if (resultado <= 18.5) {
            binding.result.setText("Seu resultado %.2f".format(resultado) + "Abaixo do peso")
        } else if (resultado >=18.6 && resultado <= 24.9){
            (binding.result.setText("Seu resultado %.2f".format(resultado) + "Peso ideal"))
        } else if (resultado >=25 && resultado<= 29.9) {
            (binding.result.setText("Seu resultado %.2f".format(resultado) + "Sobrepeso"))
        } else if (resultado >=30 && resultado <= 34.9) {
            (binding.result.setText("Seu resultado %.2f".format(resultado) + "Obeso I"))
        } else if (resultado >=35 && resultado<= 39.9) {
            (binding.result.setText("Seu resultado %.2f".format(resultado) + "Obeso II"))
        } else if (resultado >= 40){
            (binding.result.setText("Seu resultado %.2f".format(resultado) + "Obeso III"))
        }
    }
}