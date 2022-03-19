package com.example.vku_demo.ui.exam

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vku_demo.databinding.ActivityLoginBinding

/**
 * @author huypham on 3/15/22
 */
class LoginActivity: AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private var name = ""
    private var email = ""
    private var phone = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sendData()
    }

    private fun sendData() {
        binding.apply {
            btnLogin.setOnClickListener {
                name = edtName.text.toString()
                email = edtEmail.text.toString()
                phone = edtPhone.text.toString()

                val intent = Intent(this@LoginActivity, InformationActivity::class.java)
                intent.run {
                    putExtra(InformationActivity.KEY_NAME, name)
                    putExtra(InformationActivity.KEY_EMAIL, email)
                    putExtra(InformationActivity.KEY_PHONE, phone)
                }
                startActivity(intent)
            }
        }
    }

}
