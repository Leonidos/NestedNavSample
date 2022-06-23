package com.pandacoder.nestednavsample

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.pandacoder.nestednavsample.databinding.PageFragBinding

class PF0: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val bindings = PageFragBinding.inflate(inflater, container, false)
        with(bindings.pBavButton) {
            text = "to p1"
            setOnClickListener { findNavController().navigate(R.id.action_p0p1) }
        }
        with(bindings.pLabel) {
            text = "PF0"
        }
        with(bindings.root) {
            setBackgroundColor(Color.GREEN)
        }
        return bindings.root
    }
}