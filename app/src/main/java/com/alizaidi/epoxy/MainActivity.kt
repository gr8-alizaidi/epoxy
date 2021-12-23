package com.alizaidi.epoxy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpleModels = getSimpleData()
        populateList(simpleModels)

    }

    private fun populateList(simpleModels: MutableList<SimpleModel>) {
        recycler_gchat.withModels {
            simpleModels.forEachIndexed { position, model ->
                when (model.type) {
                    "Me" -> me {
                        id(position)
                        sent( model.content)
                    }
                    "Other" -> other {
                        id(position)
                        recieved(model)
                    }
                }
            }
        }
    }
}
