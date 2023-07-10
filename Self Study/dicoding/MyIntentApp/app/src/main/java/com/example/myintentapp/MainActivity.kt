package com.example.myintentapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    // Variable Initialize
    private lateinit var btnMoveActivity: Button
    private lateinit var btnMoveActivityWithData: Button
    private lateinit var btnMoveActivityWithObject: Button
    private lateinit var btnMoveActivityWithDialPhone: Button
    private lateinit var btnMoveActivityForResult: Button
    private lateinit var tvResult: TextView

    // Launcher registerForActivityResult -> accept return value
    @SuppressLint("SetTextI18n")
    private val resultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == MoveForResultActivity.RESULT_CODE && result.data != null) {
            val selectedValue =
                result.data?.getIntExtra(MoveForResultActivity.EXTRA_SELECTED_VALUE, 0)
            tvResult.text = "Result : $selectedValue"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Bind Variable with FindViewByID
        btnMoveActivity = findViewById<Button>(R.id.btnMoveActivity)
        btnMoveActivityWithData = findViewById<Button>(R.id.btnMoveActivityData)
        btnMoveActivityWithObject = findViewById<Button>(R.id.btnMoveActivityObject)
        btnMoveActivityWithDialPhone = findViewById<Button>(R.id.btnMoveActivityDialNumber)
        btnMoveActivityForResult = findViewById<Button>(R.id.btnMoveActivityForResult)
        tvResult = findViewById<TextView>(R.id.tvResult)

        // Add onClick event handler -> Point at onClick
        btnMoveActivity.setOnClickListener(this)
        btnMoveActivityWithData.setOnClickListener(this)
        btnMoveActivityWithObject.setOnClickListener(this)
        btnMoveActivityWithDialPhone.setOnClickListener(this)
        btnMoveActivityForResult.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // if v has id, that match with R.id.btnMoveActivity, then do Intent
        when (v?.id) {
            R.id.btnMoveActivity -> {
                // Explicit Intent
                // this@MainActivity -> Context -> Access resource from current activity
                // MoveActivity::class.java -> Destination
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)

                // Run new activity without passing data
                startActivity(moveIntent)
            }

            R.id.btnMoveActivityData -> {
                val moveIntentWithData = Intent(this@MainActivity, MoveActivityWithData::class.java)

                // putExtra -> Move with data -> key value
                moveIntentWithData.putExtra(
                    MoveActivityWithData.EXTRA_NAME,
                    "John"
                ) // EXTRA_NAME -> Static variable
                moveIntentWithData.putExtra(MoveActivityWithData.EXTRA_AGE, 20)

                startActivity(moveIntentWithData)
            }

            R.id.btnMoveActivityObject -> {
                val person = Person("John", 20, "john@email.com", "Jakarta")
                val moveIntentWithObject =
                    Intent(this@MainActivity, MoveActivityWithObject::class.java)

                // Assign key EXTRA_PERSON with value Person
                moveIntentWithObject.putExtra(MoveActivityWithObject.EXTRA_PERSON, person)
                startActivity(moveIntentWithObject)
            }

            R.id.btnMoveActivityDialNumber -> {
                val phoneNumber = "081234567"
                // Implicit Intent
                val dialPhoneNumber = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneNumber)
            }

            R.id.btnMoveActivityForResult -> {
                val moveIntentForResult =
                    Intent(this@MainActivity, MoveForResultActivity::class.java)
                resultLauncher.launch(moveIntentForResult)
            }
        }
    }
}