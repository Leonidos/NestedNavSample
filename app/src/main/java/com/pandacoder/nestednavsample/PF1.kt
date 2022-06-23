package com.pandacoder.nestednavsample

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.pandacoder.nestednavsample.databinding.NestedNavFragBinding

class PF1: Fragment() {

    private fun findInnerNavController(): NavController {
        return (childFragmentManager.findFragmentById(R.id.nested_nav_host_fragment_content) as NavHostFragment).navController
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val bindings = NestedNavFragBinding.inflate(inflater, container, false)
        with(bindings.bottomNavTabs) {
            setupWithNavController(findInnerNavController())
            setOnItemSelectedListener { item ->
                NavigationUI.onNavDestinationSelected(item, findInnerNavController())
                true
            }
        }
        with(bindings.root) {
            setBackgroundColor(Color.GREEN)
        }
        return bindings.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        requireActivity().onBackPressedDispatcher.addCallback(this) {
            if (!findInnerNavController().popBackStack()) {
                findMainNavController().popBackStack()
            }
        }
    }
}