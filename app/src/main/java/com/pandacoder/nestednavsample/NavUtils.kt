package com.pandacoder.nestednavsample

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation

fun Fragment.findMainNavController(): NavController {
    return Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_content_main)
}