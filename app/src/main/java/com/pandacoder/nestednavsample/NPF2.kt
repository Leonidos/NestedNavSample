package com.pandacoder.nestednavsample

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pandacoder.nestednavsample.databinding.PageFragBinding

class NPF2: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val bindings = PageFragBinding.inflate(inflater, container, false)
        with(bindings.pLabel) {
            text = "NPF2"
        }
        with(bindings.pBavButton) {
            visibility = View.INVISIBLE
        }
        with(bindings.root) {
            setBackgroundColor(Color.YELLOW)
        }
        return bindings.root
    }
}