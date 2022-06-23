package com.pandacoder.nestednavsample

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.pandacoder.nestednavsample.databinding.PageFragBinding

class NPF0: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val bindings = PageFragBinding.inflate(inflater, container, false)
        with(bindings.pLabel) {
            text = "NPF0"
        }
        with(bindings.pBavButton) {
            text = "NPF0 to NPF2"
            setOnClickListener { findNavController().navigate(R.id.action_NPF0_to_NPF2) }
        }
        with(bindings.root) {
            setBackgroundColor(Color.YELLOW)
        }
        return bindings.root
    }
}